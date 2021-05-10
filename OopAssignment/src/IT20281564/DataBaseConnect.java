package IT20281564;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/customercaredatabase";
	private static String userName = "root";
	private static String password = "sanju";
	public static Connection con;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url,userName,password);
			
		} catch (Exception e) {
			System.out.println("Database connection is not success");
		}
		return con;
	}
}
