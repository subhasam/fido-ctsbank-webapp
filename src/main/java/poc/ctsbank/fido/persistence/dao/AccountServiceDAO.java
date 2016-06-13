/**
 * 
 */
package poc.ctsbank.fido.persistence.dao;

import java.sql.SQLException;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public interface AccountServiceDAO {

	/**
	 * Method isValidUser.
	 * @param username String
	 * @param password String
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean isValidUser(String username, String password) throws SQLException;
	
	/**
	 * Method getUpdatedStatusInDB.
	 * @param fieldName String
	 * @return String
	 * @throws SQLException
	 */
	public String getUpdatedStatusInDB(String fieldName) throws SQLException;

}
