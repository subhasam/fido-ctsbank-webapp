package poc.ctsbank.fido.persistence.service;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import poc.ctsbank.fido.persistence.dao.AccountRepository;
import poc.ctsbank.fido.persistence.dao.AccountServiceDAO;
import poc.ctsbank.fido.persistence.dao.VerificationTokenRepository;
import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.model.VerificationToken;
import poc.ctsbank.fido.web.error.AccountAlreadyExistException;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository repository;

    @Autowired
    private VerificationTokenRepository tokenRepository;
    
    @Autowired
    private AccountServiceDAO accountSrvcDAO;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsService accountDetailsService;

    /**
     * Method isValidUser.
     * @param username String
     * @param password String
     * @return boolean
     * @throws SQLException
     * @see poc.ctsbank.fido.persistence.service.AccountService#isValidUser(String, String)
     */
    @Override
	public boolean isValidUser(String username, String password)
			throws SQLException {
		return accountSrvcDAO.isValidUser(username, password);
	}

    /**
     * Method registerAccount.
     * @param accountDTO AccountOwnerDTO
     * @return AccountOwner
     * @see poc.ctsbank.fido.persistence.service.AccountService#registerAccount(AccountOwnerDTO)
     */
    @Override
    public AccountOwner registerAccount(final AccountOwnerDTO accountDTO) {
        if (emailExist(accountDTO.getEmail())) {
            throw new AccountAlreadyExistException("There is an account with that email adress: " + accountDTO.getEmail());
        }
        final AccountOwner accountOwner = new AccountOwner();

        accountOwner.setAccountOwnerFirstName(accountDTO.getFirstName());
        accountOwner.setAccountOwnerLastName(accountDTO.getLastName());
        accountOwner.setPassword(passwordEncoder.encode(accountDTO.getPassword()));
        accountOwner.setEmail(accountDTO.getEmail());

        return repository.save(accountOwner);
    }

    /**
     * Method getAccountOwnerDetails.
     * @param verificationToken String
     * @return AccountOwner
     * @see poc.ctsbank.fido.persistence.service.AccountService#getAccountOwnerDetails(String)
     */
    @Override
    public AccountOwner getAccountOwnerDetails(final String verificationToken) {
        final AccountOwner user = tokenRepository.findByToken(verificationToken).getAccOwner();
        return user;
    }

    /**
     * Method getVerificationToken.
     * @param VerificationToken String
     * @return VerificationToken
     * @see poc.ctsbank.fido.persistence.service.AccountService#getVerificationToken(String)
     */
    @Override
    public VerificationToken getVerificationToken(final String VerificationToken) {
        return tokenRepository.findByToken(VerificationToken);
    }

    /**
     * Method saveRegisteredAccountOwner.
     * @param user AccountOwner
     * @see poc.ctsbank.fido.persistence.service.AccountService#saveRegisteredAccountOwner(AccountOwner)
     */
    @Override
    public void saveRegisteredAccountOwner(final AccountOwner user) {
        repository.save(user);
    }

    /**
     * Method deleteAccount.
     * @param user AccountOwner
     * @see poc.ctsbank.fido.persistence.service.AccountService#deleteAccount(AccountOwner)
     */
    @Override
    public void deleteAccount(final AccountOwner user) {
        repository.delete(user);
    }

    /**
     * Method createVerificationTokenForUser.
     * @param user AccountOwner
     * @param token String
     * @see poc.ctsbank.fido.persistence.service.AccountService#createVerificationTokenForUser(AccountOwner, String)
     */
    @Override
    public void createVerificationTokenForUser(final AccountOwner user, final String token) {
        final VerificationToken myToken = new VerificationToken(token, user);
        tokenRepository.save(myToken);
    }

    /**
     * Method generateNewVerificationToken.
     * @param existingVerificationToken String
     * @return VerificationToken
     * @see poc.ctsbank.fido.persistence.service.AccountService#generateNewVerificationToken(String)
     */
    @Override
    public VerificationToken generateNewVerificationToken(final String existingVerificationToken) {
        VerificationToken vToken = tokenRepository.findByToken(existingVerificationToken);
        vToken.updateToken(UUID.randomUUID().toString());
        vToken = tokenRepository.save(vToken);
        return vToken;
    }

    /**
     * Method findAccountOwnerByEmail.
     * @param email String
     * @return AccountOwner
     * @see poc.ctsbank.fido.persistence.service.AccountService#findAccountOwnerByEmail(String)
     */
    @Override
    public AccountOwner findAccountOwnerByEmail(final String email) {
        return repository.findByEmail(email);
    }

    /**
     * Method getAccountOwnerByID.
     * @param id long
     * @return AccountOwner
     * @see poc.ctsbank.fido.persistence.service.AccountService#getAccountOwnerByID(long)
     */
    @Override
    public AccountOwner getAccountOwnerByID(final long id) {
        return repository.findOne(id);
    }

    /**
     * Method changeAccountOwnerPassword.
     * @param user AccountOwner
     * @param password String
     * @see poc.ctsbank.fido.persistence.service.AccountService#changeAccountOwnerPassword(AccountOwner, String)
     */
    @Override
    public void changeAccountOwnerPassword(final AccountOwner user, final String password) {
        user.setPassword(passwordEncoder.encode(password));
        repository.save(user);
    }

    /**
     * Method checkIfValidOldPassword.
     * @param user AccountOwner
     * @param oldPassword String
     * @return boolean
     * @see poc.ctsbank.fido.persistence.service.AccountService#checkIfValidOldPassword(AccountOwner, String)
     */
    @Override
    public boolean checkIfValidOldPassword(final AccountOwner user, final String oldPassword) {
        return passwordEncoder.matches(oldPassword, user.getPassword());
    }

    /**
     * Method validateVerificationToken.
     * @param token String
     * @return String
     * @see poc.ctsbank.fido.persistence.service.AccountService#validateVerificationToken(String)
     */
    @Override
    public String validateVerificationToken(String token) {
        final VerificationToken verificationToken = tokenRepository.findByToken(token);
        if (verificationToken == null) {
            return "invalidToken";
        }

        final AccountOwner accOwner = verificationToken.getAccOwner();
        final Calendar cal = Calendar.getInstance();
        if ((verificationToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
            return "expired";
        }

        accOwner.setEnabled(true);
        repository.save(accOwner);
        return null;
    }

    /**
     * Method emailExist.
     * @param email String
     * @return boolean
     */
    private boolean emailExist(final String email) {
        final AccountOwner accOwner = repository.findByEmail(email);
        if (accOwner != null) {
            return true;
        }
        return false;
    }

	/**
	 * Method createPasswordResetTokenForUser.
	 * @param user AccountOwner
	 * @param token String
	 * @see poc.ctsbank.fido.persistence.service.AccountService#createPasswordResetTokenForUser(AccountOwner, String)
	 */
	@Override
	public void createPasswordResetTokenForUser(AccountOwner user, String token) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
		
	}

	/**
	 * Method getAccountOwnerByPasswordResetToken.
	 * @param token String
	 * @return AccountOwner
	 * @see poc.ctsbank.fido.persistence.service.AccountService#getAccountOwnerByPasswordResetToken(String)
	 */
	@Override
	public AccountOwner getAccountOwnerByPasswordResetToken(String token) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	/**
	 * Method validatePasswordResetToken.
	 * @param id long
	 * @param token String
	 * @return String
	 * @see poc.ctsbank.fido.persistence.service.AccountService#validatePasswordResetToken(long, String)
	 */
	@Override
	public String validatePasswordResetToken(long id, String token) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}	

}