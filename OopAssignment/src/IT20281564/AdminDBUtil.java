package IT20281564;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	
	private static boolean isSuccess;
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	
	//validate admin login credentials
	public static boolean validateAdmin(String username,String password) {
		try {
			connection = DataBaseConnect.getConnection();
			statement = connection.createStatement();
			String sql = "select * from administrator where AdministratorUsername='"+username+"' and AdministratorcolPassword='"+password+"'";
			resultSet = statement.executeQuery(sql);
			
			if (resultSet.next()) {
				isSuccess = true ;
			}else {
				isSuccess = false ;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	//Administrator object creation and assigning values
	public static List<Administrator> getAdministrator(String username){
		ArrayList<Administrator> Admin = new ArrayList<Administrator>();
		
		try {
			connection = DataBaseConnect.getConnection();
			statement = connection.createStatement();
			String sql = "select * from administrator where AdministratorUsername='"+username+"'";
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()) {
				
				int id = resultSet.getInt(1);
				String Name = resultSet.getString(2);
				String Username = resultSet.getString(3);
				String password = resultSet.getString(4);
				
				Administrator ad = new Administrator(id, Name, Username, password);
				Admin.add(ad);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Admin;
	}

	
}
