/**
 * 
 */
package poc.ctsbank.fido.persistence.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

/**
 * @author Subhasis Samal
 *
 * @version $Revision: 1.0 $
 */
public class AccountServiceDAOImpl implements AccountServiceDAO {

	private DataSource accOwnerDataSource;

	/**
	
	 * @return the accOwnerDataSource */
	public DataSource getAccOwnerDataSource() {
		return accOwnerDataSource;
	}

	/**
	 * @param accOwnerDataSource the accOwnerDataSource to set
	 */
	public void setAccOwnerDataSource(DataSource accOwnerDataSource) {
		this.accOwnerDataSource = accOwnerDataSource;
	}

	/**
	 * Method isValidUser.
	 * @param username String
	 * @param password String
	 * @return boolean
	 * @throws SQLException
	 * @see poc.ctsbank.fido.persistence.dao.AccountServiceDAO#isValidUser(String, String)
	 */
	@Override
	public boolean isValidUser(String username, String password)
			throws SQLException {
		String query = "Select count(1) from user where username = ? and password = ?";
		PreparedStatement pstmt = accOwnerDataSource.getConnection().prepareStatement(
				query);
		pstmt.setString(1, username);
		pstmt.setString(2, password);
		ResultSet resultSet = pstmt.executeQuery();
		if (resultSet.next()) {
			return (resultSet.getInt(1) > 0);
		} else {
			return false;
		}
	}

	/**
	 * Method getUpdatedStatusInDB.
	 * @param fieldName String
	 * @return String
	 * @throws SQLException
	 * @see poc.ctsbank.fido.persistence.dao.AccountServiceDAO#getUpdatedStatusInDB(String)
	 */
	@Override
	public String getUpdatedStatusInDB(String fieldName) throws SQLException {
		String accAuthStatusUpdtQuery = "Select acc_auth_stat from auth_request where username = ?";
		PreparedStatement accAuthStatPsmt = accOwnerDataSource.getConnection().prepareStatement(
				accAuthStatusUpdtQuery);
		accAuthStatPsmt.setString(1, fieldName);
		ResultSet accAuthStatRS = accAuthStatPsmt.executeQuery();
		if (accAuthStatRS.next()) {
			return (accAuthStatRS.getString(0));
		} else {
			return null;
		}
		
	}

}
