package poc.ctsbank.fido.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import poc.ctsbank.fido.persistence.dao.AccountRepository;
import poc.ctsbank.fido.persistence.model.AccountOwner;

@Service("accountDetailsService")
@Transactional
public class AccountUserDetailsService implements UserDetailsService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private AccountLoginAttemptService loginAttemptService;

    @Autowired
    private HttpServletRequest request;

    public AccountUserDetailsService() {
        super();
    }

    // API

    @Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
        final String ip = getClientIP();
        if (loginAttemptService.isBlocked(ip)) {
            throw new RuntimeException("blocked");
        }

        try {
            final AccountOwner accountOwner = accountRepository.findByEmail(email);
            if (accountOwner == null) {
                throw new UsernameNotFoundException("No user found with username: " + email);
            }

            return new org.springframework.security.core.userdetails.User(accountOwner.getEmail(), accountOwner.getPassword(), accountOwner.isEnabled(), true, true, true, null);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

   private final List<GrantedAuthority> getGrantedAuthorities(final List<String> privileges) {
        final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (final String privilege : privileges) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }

    private String getClientIP() {
        final String xfHeader = request.getHeader("X-Forwarded-For");
        if (xfHeader == null) {
            return request.getRemoteAddr();
        }
        return xfHeader.split(",")[0];
    }
}
