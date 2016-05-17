package poc.ctsbank.fido.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import poc.ctsbank.fido.persistence.model.AccountOwner;

public interface AccountRepository extends JpaRepository<AccountOwner, Long> {
    AccountOwner findByEmail(String email);

    @Override
    void delete(AccountOwner account);

}
