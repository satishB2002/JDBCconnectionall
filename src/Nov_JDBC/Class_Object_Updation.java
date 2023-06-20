package Nov_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Class_Object_Updation {
public static Connection connectData() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/november","root","1234");
		return con;
		
	} catch (Exception e) {
		return null;
	}
	
	
	
	
	
}
}
