package poc.ctsbank.fido.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poc.ctsbank.fido.persistence.model.AccountOwner;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public interface AccountRepository extends JpaRepository<AccountOwner, Long> {
    /**
     * Method findByEmail.
     * @param email String
     * @return AccountOwner
     */
    AccountOwner findByEmail(String email);

    /**
     * Method delete.
     * @param account AccountOwner
     */
    @Override
    void delete(AccountOwner account);

}
