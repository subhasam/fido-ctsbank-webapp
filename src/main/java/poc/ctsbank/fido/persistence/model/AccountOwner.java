package poc.ctsbank.fido.persistence.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.springframework.context.annotation.Role;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@Entity
public class AccountOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;
    
    private String accountNumber;
    
    private String routingNumber;  

	@Column(length = 60)
    private String password;

    private boolean enabled;

    private boolean tokenExpired;

    //

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id") )
    private Collection<Role> roles;

    public AccountOwner() {
        super();
        this.enabled = false;
        this.tokenExpired = false;
    }

    /**
     * Method getId.
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     * Method setId.
     * @param id Long
     */
    public void setId(final Long id) {
        this.id = id;
    }

    /**
     * Method getFirstName.
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Method setFirstName.
     * @param firstName String
     */
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    /**
     * Method getLastName.
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Method setLastName.
     * @param lastName String
     */
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    /**
     * Method getEmail.
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method setEmail.
     * @param username String
     */
    public void setEmail(final String username) {
        this.email = username;
    }

    /**
	
	 * @return the accountNumber */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * Method getPassword.
	 * @return String
	 */
	public String getPassword() {
        return password;
    }

    /**
     * Method setPassword.
     * @param password String
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Method isEnabled.
     * @return boolean
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Method setEnabled.
     * @param enabled boolean
     */
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Method isTokenExpired.
     * @return boolean
     */
    public boolean isTokenExpired() {
        return tokenExpired;
    }

    /**
     * Method setTokenExpired.
     * @param expired boolean
     */
    public void setTokenExpired(final boolean expired) {
        this.tokenExpired = expired;
    }
    
    /**
   	 * @return the routingNumber
   	 */
   	public String getRoutingNumber() {
   		return routingNumber;
   	}

   	/**
   	 * @param routingNumber the routingNumber to set
   	 */
   	public void setRoutingNumber(String routingNumber) {
   		this.routingNumber = routingNumber;
   	}

    /**
     * Method hashCode.
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        return result;
    }

    /**
     * Method equals.
     * @param obj Object
     * @return boolean
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AccountOwner accOwner = (AccountOwner) obj;
        if (!email.equals(accOwner.email)) {
            return false;
        }
        return true;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountOwner [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email
				+ ", accountNumber=" + accountNumber + ", enabled=" + enabled
				+ ", tokenExpired=" + tokenExpired + ", roles=" + roles + "]";
	}

}