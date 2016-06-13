package poc.ctsbank.fido.persistence.service;

import java.sql.SQLException;

import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.model.VerificationToken;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public interface AccountService {
	
	/**
	 * Method isValidUser.
	 * @param username String
	 * @param password String
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean isValidUser(String username, String password) throws SQLException;

    /**
     * Method registerAccount.
     * @param accountDto AccountOwnerDTO
     * @return AccountOwner
     */
    AccountOwner registerAccount(AccountOwnerDTO accountDto);

    /**
     * Method getAccountOwnerDetails.
     * @param verificationToken String
     * @return AccountOwner
     */
    AccountOwner getAccountOwnerDetails(String verificationToken);

    /**
     * Method saveRegisteredAccountOwner.
     * @param user AccountOwner
     */
    void saveRegisteredAccountOwner(AccountOwner user);

    /**
     * Method deleteAccount.
     * @param user AccountOwner
     */
    void deleteAccount(AccountOwner user);

    /**
     * Method createVerificationTokenForUser.
     * @param accountOwner AccountOwner
     * @param token String
     */
    void createVerificationTokenForUser(AccountOwner accountOwner, String token);

    /**
     * Method getVerificationToken.
     * @param VerificationToken String
     * @return VerificationToken
     */
    VerificationToken getVerificationToken(String VerificationToken);

    /**
     * Method generateNewVerificationToken.
     * @param token String
     * @return VerificationToken
     */
    VerificationToken generateNewVerificationToken(String token);

    /**
     * Method createPasswordResetTokenForUser.
     * @param user AccountOwner
     * @param token String
     */
    void createPasswordResetTokenForUser(AccountOwner user, String token);

    /**
     * Method findAccountOwnerByEmail.
     * @param email String
     * @return AccountOwner
     */
    AccountOwner findAccountOwnerByEmail(String email);    

    /**
     * Method getAccountOwnerByPasswordResetToken.
     * @param token String
     * @return AccountOwner
     */
    AccountOwner getAccountOwnerByPasswordResetToken(String token);

    /**
     * Method getAccountOwnerByID.
     * @param id long
     * @return AccountOwner
     */
    AccountOwner getAccountOwnerByID(long id);

    /**
     * Method changeAccountOwnerPassword.
     * @param user AccountOwner
     * @param password String
     */
    void changeAccountOwnerPassword(AccountOwner user, String password);

    /**
     * Method checkIfValidOldPassword.
     * @param user AccountOwner
     * @param password String
     * @return boolean
     */
    boolean checkIfValidOldPassword(AccountOwner user, String password);

    /**
     * Method validatePasswordResetToken.
     * @param id long
     * @param token String
     * @return String
     */
    String validatePasswordResetToken(long id, String token);

    /**
     * Method validateVerificationToken.
     * @param token String
     * @return String
     */
    String validateVerificationToken(String token);

}
