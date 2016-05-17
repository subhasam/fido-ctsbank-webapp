package poc.ctsbank.fido.persistence.service;

import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.model.VerificationToken;

public interface AccountService {

    AccountOwner registerAccount(AccountOwnerDTO accountDto);

    AccountOwner getAccountOwnerDetails(String verificationToken);

    void saveRegisteredAccountOwner(AccountOwner user);

    void deleteAccount(AccountOwner user);

    void createVerificationTokenForUser(AccountOwner accountOwner, String token);

    VerificationToken getVerificationToken(String VerificationToken);

    VerificationToken generateNewVerificationToken(String token);

    void createPasswordResetTokenForUser(AccountOwner user, String token);

    AccountOwner findAccountOwnerByEmail(String email);    

    AccountOwner getAccountOwnerByPasswordResetToken(String token);

    AccountOwner getAccountOwnerByID(long id);

    void changeAccountOwnerPassword(AccountOwner user, String password);

    boolean checkIfValidOldPassword(AccountOwner user, String password);

    String validatePasswordResetToken(long id, String token);

    String validateVerificationToken(String token);

}
