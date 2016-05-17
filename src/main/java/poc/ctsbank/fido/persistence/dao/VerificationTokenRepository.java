package poc.ctsbank.fido.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    VerificationToken findByToken(String token);

    VerificationToken findByUser(AccountOwner user);

}
