/**
 * 
 */
package poc.ctsbank.fido.persistence.delegate;

import java.sql.SQLException;

import poc.ctsbank.fido.persistence.service.AccountService;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public class AccountRegistartionDelegate
{
		private AccountService accountService;

		/**
		 * Method getUserService.
		 * @return AccountService
		 */
		public AccountService getUserService()
		{
				return this.accountService;
		}

		/**
		 * Method setUserService.
		 * @param accountService AccountService
		 */
		public void setUserService(AccountService accountService)
		{
				this.accountService = accountService;
		}

		/**
		 * Method isValidUser.
		 * @param username String
		 * @param password String
		 * @return boolean
		 * @throws SQLException
		 */
		public boolean isValidUser(String username, String password) throws SQLException
    {
		    return accountService.isValidUser(username, password);
    }
}
