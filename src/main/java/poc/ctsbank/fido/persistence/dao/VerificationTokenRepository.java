package poc.ctsbank.fido.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poc.ctsbank.fido.persistence.model.AccountOwner;
import poc.ctsbank.fido.persistence.model.VerificationToken;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    /**
     * Method findByToken.
     * @param token String
     * @return VerificationToken
     */
    VerificationToken findByToken(String token);

    /**
     * Method findByUser.
     * @param user AccountOwner
     * @return VerificationToken
     */
    VerificationToken findByUser(AccountOwner user);

}
