package poc.ctsbank.fido.persistence.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
@Entity
public class VerificationToken {

    private static final int EXPIRATION = 60 * 24;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String token;

    @OneToOne(targetEntity = AccountOwner.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private AccountOwner accOwner;

    private Date expiryDate;

    public VerificationToken() {
        super();
    }

    /**
     * Constructor for VerificationToken.
     * @param token String
     */
    public VerificationToken(final String token) {
        super();

        this.token = token;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
    }

    /**
     * Constructor for VerificationToken.
     * @param token String
     * @param accHolder AccountOwner
     */
    public VerificationToken(final String token, final AccountOwner accHolder) {
        super();

        this.token = token;
        this.accOwner = accHolder;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
    }

    /**
     * Method getToken.
     * @return String
     */
    public String getToken() {
        return token;
    }

    /**
     * Method setToken.
     * @param token String
     */
    public void setToken(final String token) {
        this.token = token;
    }

    /**
     * Method getAccOwner.
     * @return AccountOwner
     */
    public AccountOwner getAccOwner() {
        return accOwner;
    }

    /**
     * Method setAccOwner.
     * @param user AccountOwner
     */
    public void setAccOwner(final AccountOwner user) {
        this.accOwner = user;
    }

    /**
     * Method getExpiryDate.
     * @return Date
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * Method setExpiryDate.
     * @param expiryDate Date
     */
    public void setExpiryDate(final Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * Method calculateExpiryDate.
     * @param expiryTimeInMinutes int
     * @return Date
     */
    private Date calculateExpiryDate(final int expiryTimeInMinutes) {
        final Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(new Date().getTime());
        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
        return new Date(cal.getTime().getTime());
    }

    /**
     * Method updateToken.
     * @param token String
     */
    public void updateToken(final String token) {
        this.token = token;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
    }

    //

    /**
     * Method hashCode.
     * @return int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
        result = prime * result + ((token == null) ? 0 : token.hashCode());
        result = prime * result + ((accOwner == null) ? 0 : accOwner.hashCode());
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
        final VerificationToken other = (VerificationToken) obj;
        if (expiryDate == null) {
            if (other.expiryDate != null) {
                return false;
            }
        } else if (!expiryDate.equals(other.expiryDate)) {
            return false;
        }
        if (token == null) {
            if (other.token != null) {
                return false;
            }
        } else if (!token.equals(other.token)) {
            return false;
        }
        if (accOwner == null) {
            if (other.accOwner != null) {
                return false;
            }
        } else if (!accOwner.equals(other.accOwner)) {
            return false;
        }
        return true;
    }

    /**
     * Method toString.
     * @return String
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Token [String=").append(token).append("]").append("[Expires").append(expiryDate).append("]");
        return builder.toString();
    }

}
