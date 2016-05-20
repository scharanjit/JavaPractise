package j2ee1001;

import java.sql.*;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map.Entry;

/*PreparedStatement object is used for
 *  for sending SQL statements to the database
 *  
 *  The main feature of a PreparedStatement object is that, unlike a Statement object,
 *   it is given a SQL statement when it is created. The advantage to this is that in most cases, 
 *   this SQL statement is sent to the DBMS right away, where it is compiled. As a result, the PreparedStatement 
 *   object contains not just a SQL statement, but a SQL statement that has been precompiled.
 *    This means that when the PreparedStatement is executed, 
 *  the DBMS can just run the PreparedStatement SQL statement without having to compile it first.*/
public class PreparedStatement {
//	public void updateCoffeeSales(HashMap<String, Integer> salesForWeek)
//			throws SQLException {
//		Connection con;
//		PreparedStatement updateSales = null;
//		PreparedStatement updateTotal = null;
//
//		String updateString =
//				"update COFFEES " +
//						"set SALES = ? where COF_NAME = ?";
//
//		String updateStatement =
//				"update .COFFEES " +
//						"set TOTAL = TOTAL + ? " +
//						"where COF_NAME = ?";
//
//		try {
//			con.setAutoCommit(false);
//			updateSales = (PreparedStatement) con.prepareStatement(updateString);
//			updateTotal = (PreparedStatement) con.prepareStatement(updateStatement);
//
//			for (Entry<String, Integer> e : salesForWeek.entrySet()) {
//				((java.sql.PreparedStatement) updateSales).setInt(1, e.getValue().intValue());
//				((java.sql.PreparedStatement) updateSales).setString(2, e.getKey());
//				((java.sql.PreparedStatement) updateSales).executeUpdate();
//				((java.sql.PreparedStatement) updateTotal).setInt(1, e.getValue().intValue());
//				((java.sql.PreparedStatement) updateTotal).setString(2, e.getKey());
//				((java.sql.PreparedStatement) updateTotal).executeUpdate();
//				con.commit();
//			}
//		} catch (SQLException e ) {
//			JDBCTutorialUtilities.printSQLException(e);
//			if (con != null) {
//				try {
//					System.err.print("Transaction is being rolled back");
//					con.rollback();
//				} catch(SQLException excep) {
//					JDBCTutorialUtilities.printSQLException(excep);
//				}
//			}
//		} finally {
//			if (updateSales != null) {
//				updateSales.close();
//			}
//			if (updateTotal != null) {
//				updateTotal.close();
//			}
//			con.setAutoCommit(true);
//		}
//	}

}
