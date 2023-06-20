package Nov_JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Crud_Operation_Class_Object {
	public static Connection createconnection() {
		String url,user_name,user_pass;
	
		url="jdbc:mysql://localhost:3306/november";
		user_name="root";
		user_pass="1234";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection(url,user_name,user_pass);
			return con;
			
		} catch (Exception e) {
			System.out.println("Database Not Connected");
			return null;
			
		}
		
	
		
	}
}
