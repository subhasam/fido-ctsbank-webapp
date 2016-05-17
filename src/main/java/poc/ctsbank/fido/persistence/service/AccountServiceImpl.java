package poc.ctsbank.fido.persistence.service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import poc.ctsbank.fido.persistence.dao.AccountRepository;
import poc.ctsbank.fido.persistence.dao.VerificationTokenRepository;
import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.model.VerificationToken;
import poc.ctsbank.fido.web.error.AccountAlreadyExistException;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository repository;

    @Autowired
    private VerificationTokenRepository tokenRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDetailsService accountDetailsService;

    // API

    @Override
    public AccountOwner registerAccount(final AccountOwnerDTO accountDTO) {
        if (emailExist(accountDTO.getEmail())) {
            throw new AccountAlreadyExistException("There is an account with that email adress: " + accountDTO.getEmail());
        }
        final AccountOwner accountOwner = new AccountOwner();

        accountOwner.setFirstName(accountDTO.getFirstName());
        accountOwner.setLastName(accountDTO.getLastName());
        accountOwner.setPassword(passwordEncoder.encode(accountDTO.getPassword()));
        accountOwner.setEmail(accountDTO.getEmail());

        return repository.save(accountOwner);
    }

    @Override
    public AccountOwner getAccountOwnerDetails(final String verificationToken) {
        final AccountOwner user = tokenRepository.findByToken(verificationToken).getUser();
        return user;
    }

    @Override
    public VerificationToken getVerificationToken(final String VerificationToken) {
        return tokenRepository.findByToken(VerificationToken);
    }

    @Override
    public void saveRegisteredAccountOwner(final AccountOwner user) {
        repository.save(user);
    }

    @Override
    public void deleteAccount(final AccountOwner user) {
        repository.delete(user);
    }

    @Override
    public void createVerificationTokenForUser(final AccountOwner user, final String token) {
        final VerificationToken myToken = new VerificationToken(token, user);
        tokenRepository.save(myToken);
    }

    @Override
    public VerificationToken generateNewVerificationToken(final String existingVerificationToken) {
        VerificationToken vToken = tokenRepository.findByToken(existingVerificationToken);
        vToken.updateToken(UUID.randomUUID().toString());
        vToken = tokenRepository.save(vToken);
        return vToken;
    }

    @Override
    public AccountOwner findAccountOwnerByEmail(final String email) {
        return repository.findByEmail(email);
    }

    @Override
    public AccountOwner getAccountOwnerByID(final long id) {
        return repository.findOne(id);
    }

    @Override
    public void changeAccountOwnerPassword(final AccountOwner user, final String password) {
        user.setPassword(passwordEncoder.encode(password));
        repository.save(user);
    }

    @Override
    public boolean checkIfValidOldPassword(final AccountOwner user, final String oldPassword) {
        return passwordEncoder.matches(oldPassword, user.getPassword());
    }

    @Override
    public String validateVerificationToken(String token) {
        final VerificationToken verificationToken = tokenRepository.findByToken(token);
        if (verificationToken == null) {
            return "invalidToken";
        }

        final AccountOwner accOwner = verificationToken.getUser();
        final Calendar cal = Calendar.getInstance();
        if ((verificationToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
            return "expired";
        }

        accOwner.setEnabled(true);
        repository.save(accOwner);
        return null;
    }

    private boolean emailExist(final String email) {
        final AccountOwner accOwner = repository.findByEmail(email);
        if (accOwner != null) {
            return true;
        }
        return false;
    }

	@Override
	public void createPasswordResetTokenForUser(AccountOwner user, String token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AccountOwner getAccountOwnerByPasswordResetToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validatePasswordResetToken(long id, String token) {
		// TODO Auto-generated method stub
		return null;
	}

}