package Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Collection;

public class Word_Counter_Application {
public static Connection appmethod() {
	String url,user_name,user_pass;
	url="jdbc:mysql://localhost:3306/ project1";
	user_name ="root";
	user_pass ="1234";

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
