/**
 * 
 */
package poc.ctsbank.fido.persistence.dao;

import java.sql.SQLException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public class AuthStatusRequestListener {
	
	/** Multiple Threads in case invocation overlaps */
	private static final int NUM_THREADS = 2;
	private static final boolean INTERRUPT_IF_RUNNING = true;
	private String accAuthStatus = null;
	private static final long INITIAL_DELAY_MILLISECONDS = TimeUnit.SECONDS.toMillis(1);
	/** The maximum amount of time to pause between retries. */
	private static final long MAX_PAUSE_MILLISECONDS = TimeUnit.SECONDS.toMillis(10);
	private static final long MAX_WAIT_TIME_AUTH_STAT_CHECK = TimeUnit.MINUTES.toMillis(5);
	private static final int MAX_ATTEMPTS_FOR_AUTH_STAT_CHECK = (int) (MAX_WAIT_TIME_AUTH_STAT_CHECK / MAX_PAUSE_MILLISECONDS);
	/** The number of times we have attempted to retry. */
	private int attemptedRetry;
	
	private boolean authStatChanged = false;
	private long totalWaitTime;
	private long totalTimeSpentForDBQuery;
	
	/**
	
	 * @return the authStatChanged */
	public boolean isAuthStatChanged() {
		return authStatChanged;
	}
	/**
	 * @param authStatChanged the authStatChanged to set
	 */
	public void setAuthStatChanged(boolean authStatChanged) {
		this.authStatChanged = authStatChanged;
	}
	/**
	
	 * @return the accAuthStatus */
	public String getAccAuthStatus() {
		return accAuthStatus;
	}
	/**
	 * @param accAuthStatus the accAuthStatus to set
	 */
	public void setAccAuthStatus(String accAuthStatus) {
		this.accAuthStatus = accAuthStatus;
	}
	
	/**
	 * Method monitorAuthSatus.
	 * @param initialStatus String
	 * @param accountSrvcDAO AccountServiceDAO
	 * @return String
	 */
	public synchronized String monitorAuthSatus(final String initialStatus,
			AccountServiceDAO accountSrvcDAO) {// throws InterruptedException 

		int maxRetryforJob = MAX_ATTEMPTS_FOR_AUTH_STAT_CHECK;
		long jobMaxWaitTime = MAX_WAIT_TIME_AUTH_STAT_CHECK;
		
		ScheduledExecutorService scheduledExecutorService = null;
		Runnable accAuthStatusTrackerTask = null;
		ScheduledFuture<?> accAuthStatusFuture = null;
		Runnable stopAccAuthStatusTrackerTask = null;		
		try {
			resetStatusForTracking();
			
			scheduledExecutorService = Executors.newScheduledThreadPool(NUM_THREADS);
			if( null == accountSrvcDAO || null == accountSrvcDAO.getUpdatedStatusInDB(null)) {
				accountSrvcDAO = new AccountServiceDAOImpl();
			}					
			accAuthStatusTrackerTask = new AccountAuthStatusTracker(initialStatus, maxRetryforJob,
					accountSrvcDAO);
			
			accAuthStatusFuture = scheduledExecutorService
					.scheduleWithFixedDelay(accAuthStatusTrackerTask, INITIAL_DELAY_MILLISECONDS,
							MAX_PAUSE_MILLISECONDS, TimeUnit.MILLISECONDS);
			
			/* Scheduled Job for Stopping the Task after Max Wait Time */
			stopAccAuthStatusTrackerTask = new StopDBAuthStatListener(accAuthStatusFuture);
			scheduledExecutorService.schedule(stopAccAuthStatusTrackerTask, jobMaxWaitTime,
					TimeUnit.MILLISECONDS);
			totalWaitTime = TimeUnit.SECONDS.toMillis(INITIAL_DELAY_MILLISECONDS);
			//long startTime = System.currentTimeMillis();			
			while (attemptedRetry < maxRetryforJob && (null == accAuthStatus || accAuthStatus.trim()
					.equalsIgnoreCase(accAuthStatus.trim()))) {			
				accAuthStatus = getAccAuthStatus();
							
				if ( null != accAuthStatus 
						&& !accAuthStatus.trim().equalsIgnoreCase(initialStatus) ) { //totalWaitTime > jobMaxWaitTime
					System.out.println("\nWithin WHILE-Loop. Initial Status = "
							+ initialStatus
							+ ", Updated Status from DB = "
							+ accAuthStatus + " \nAnd Total"
							+ " Delay = " + totalWaitTime
							+ ", compared to MaxWaitTime " + jobMaxWaitTime
							+ "\nTotal Attempts = " + attemptedRetry
							+ ", Max Allowed Attempts = " + maxRetryforJob);
					shutdownAccAuthStatExecuterSrvc(scheduledExecutorService, accAuthStatusFuture);
					break;
				}
				Thread.currentThread().sleep(INITIAL_DELAY_MILLISECONDS);

			}//end-while
			
			/* Stops the Job */
			
			if (!scheduledExecutorService.isShutdown() || !scheduledExecutorService.isTerminated()) {
				accAuthStatusFuture.cancel(INTERRUPT_IF_RUNNING);				
				scheduledExecutorService.shutdownNow();
			}
			
		} catch(InterruptedException thIntrptEx){			
			//Thread.currentThread().interrupt();
			try {
				shutdownAccAuthStatExecuterSrvc(scheduledExecutorService, accAuthStatusFuture);
			} catch (InterruptedException thIntrruptExcp) {
				thIntrruptExcp.printStackTrace();
			}
		} catch (Exception exception) {
			
			try {
				shutdownAccAuthStatExecuterSrvc(scheduledExecutorService, accAuthStatusFuture);
			} catch (InterruptedException thIntrptExcp) {
				thIntrptExcp.printStackTrace();
			}
			exception.printStackTrace();
		}
		
		return accAuthStatus;
	}
	
	private void resetStatusForTracking() {		
		this.accAuthStatus = null;
		this.attemptedRetry = 0;
	}
	

	/**
	 * Inner class that query SQL DB for Latest status.
	 * @author Subhasis Samal
	 * @version $Revision: 1.0 $
	 */
	private final class AccountAuthStatusTracker implements Runnable {
		
		private String initialAccAuthRes = null;
		private AccountServiceDAO accServiceDAO = null;
		private int maxAttemptForJob = 0;

		/**
		 * Constructor for AccountAuthStatusTracker.
		 * @param initialAccAuthRes String
		 * @param maxAttempt int
		 * @param accountAuthStatTrackerDAO AccountServiceDAO
		 */
		public AccountAuthStatusTracker(String initialAccAuthRes,
				int maxAttempt, AccountServiceDAO accountAuthStatTrackerDAO) {			
			this.initialAccAuthRes = initialAccAuthRes;
			this.maxAttemptForJob = maxAttempt;
			this.accServiceDAO = accountAuthStatTrackerDAO;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			//System.out.println("\nAttempt# "+attemptedRetry+"-ENTER RUN");
			String artfactUpdtStatAfterPolling = "";
			String accUpdatedAuthStat = null;
				long execStartTime = System.currentTimeMillis();
			if ((null == accAuthStatus || accAuthStatus.trim()
					.equalsIgnoreCase(initialAccAuthRes.trim()))
					&& attemptedRetry < maxAttemptForJob) {
				accUpdatedAuthStat = retryAccAuthStausUpdate(initialAccAuthRes, accServiceDAO);

				attemptedRetry++;				
			} else {		
					System.out.println("Initial Staus = "
							+ initialAccAuthRes + " and Updated Status = "
							+ accAuthStatus
							+ ", Total Attempts = "+attemptedRetry+", Max Attempts = "+maxAttemptForJob+"..So EXITING Scheduler/Listener.");
					System.out.println("\nAttempt# "+attemptedRetry+"-Returning from run() with InterruptedException");
					if (!Thread.currentThread().isInterrupted()) {
						System.out.println("\nrun() :: ************ Interrupting Thread *****************");
						Thread.currentThread().interrupt();
					}
					throw new RuntimeException();
					
				}
				
				totalWaitTime += TimeUnit.SECONDS.toMillis(MAX_PAUSE_MILLISECONDS) + ( System.currentTimeMillis() - execStartTime );
				System.out.println("\nAttempt# "+attemptedRetry+"-EXIT RUN"+" An With Time in SECONDS approx. "+TimeUnit.MILLISECONDS.toSeconds(totalWaitTime)+" seconds");			
			
		}
		
		/**
		 * Method retryAccAuthStausUpdate.
		 * @param fieldName String
		 * @param accAuthStatTrackerDAO AccountServiceDAO
		 * @return String
		 */
		private synchronized String retryAccAuthStausUpdate(String fieldName, AccountServiceDAO accAuthStatTrackerDAO) {
			String accAuthUpdatedStat = null;
			try {			
			if( null == accAuthStatTrackerDAO || null == accAuthStatTrackerDAO.getUpdatedStatusInDB(fieldName)) {
				accAuthStatTrackerDAO = new AccountServiceDAOImpl();
			}
			accAuthUpdatedStat = accAuthStatTrackerDAO.getUpdatedStatusInDB(fieldName);			
			} catch(Exception databaseExcp) {
				databaseExcp.printStackTrace();
			}
			return accAuthUpdatedStat;
		}
	}
	
	/**
	 * Inner class that pause the task of querying DB.
	 * @author 313727
	 * @version $Revision: 1.0 $
	 */
	private final class StopDBAuthStatListener implements Runnable {

		private ScheduledFuture<?> schldFutureStopTask;

		/**
		 * @param schldFutureStopTask
		 */
		public StopDBAuthStatListener(ScheduledFuture<?> schldFutureStopTask) {
			super();
			this.schldFutureStopTask = schldFutureStopTask;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			System.out.println("Shutting Down ScheduledExecutorService");
			schldFutureStopTask.cancel(INTERRUPT_IF_RUNNING);
		}

	}
	
	/**
	 * Method shutdownArtifactExecuterSrvc.
	 * @param schedulerSrvc ScheduledExecutorService
	 * @param scheduleResult ScheduledFuture<?>
	 * @throws InterruptedException
	 */
	private void shutdownAccAuthStatExecuterSrvc(ScheduledExecutorService schedulerSrvc, ScheduledFuture<?> scheduleResult) throws InterruptedException {
		scheduleResult.cancel(INTERRUPT_IF_RUNNING);
		schedulerSrvc.shutdownNow();
	}

}
