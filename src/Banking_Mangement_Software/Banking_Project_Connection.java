package Banking_Mangement_Software;

import java.sql.Connection;
import java.sql.DriverManager;

public class Banking_Project_Connection {
	public static Connection Datainfo() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ Banking_Management_Software","root","1234");
			System.out.println("Database is Connected");
			return con;
		} catch (Exception e) {
			System.out.println("Database Not Connected");
			return null;
			
		}
		
	}
	
}
