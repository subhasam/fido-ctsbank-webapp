package poc.ctsbank.fido.persistence.service;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import poc.ctsbank.fido.validation.PasswordMatches;
import poc.ctsbank.fido.validation.ValidEmail;
import poc.ctsbank.fido.validation.ValidPassword;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@PasswordMatches
public class AccountOwnerDTO {
    @NotNull
    @Size(min = 1)
    private String firstName;

    @NotNull
    @Size(min = 1)
    private String lastName;

    @ValidPassword
    private String password;

    @NotNull
    @Size(min = 1)
    private String matchingPassword;

    @ValidEmail
    @NotNull
    @Size(min = 1)
    private String email;
    
    @NotNull
    @Size(min = 1)
    private String accountNumber;
    
    @NotNull
    @Size(min = 1)
    private String routingNumber;

    /**
     * Method getEmail.
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * Method setEmail.
     * @param email String
     */
    public void setEmail(final String email) {
        this.email = email;
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
     * Method getMatchingPassword.
     * @return String
     */
    public String getMatchingPassword() {
        return matchingPassword;
    }

    /**
     * Method setMatchingPassword.
     * @param matchingPassword String
     */
    public void setMatchingPassword(final String matchingPassword) {
        this.matchingPassword = matchingPassword;
    }

    /**
	 * @return the accountNumber
	 */
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountNumber == null) ? 0 : accountNumber.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime
				* result
				+ ((matchingPassword == null) ? 0 : matchingPassword.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((routingNumber == null) ? 0 : routingNumber.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountOwnerDTO other = (AccountOwnerDTO) obj;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (matchingPassword == null) {
			if (other.matchingPassword != null)
				return false;
		} else if (!matchingPassword.equals(other.matchingPassword))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (routingNumber == null) {
			if (other.routingNumber != null)
				return false;
		} else if (!routingNumber.equals(other.routingNumber))
			return false;
		return true;
	}

	
}
