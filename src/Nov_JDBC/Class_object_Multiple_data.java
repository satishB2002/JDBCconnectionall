package Nov_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Class_object_Multiple_data {
public static Connection data() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/november","root","1234");
		System.out.println("Database Connected");
		return con;
	} catch (Exception e) {
		System.out.println("Database Not Connected");
		return null;
	}
	
	
	
}
	

}
