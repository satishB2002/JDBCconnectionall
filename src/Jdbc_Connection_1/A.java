package Jdbc_Connection_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class A {
public static Connection main(String[] args){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	
	String url	="mysql:jdbc://localhost:3306:weapon";
	String username ="password";
	String password="1234";
		Connection con=DriverManager.getConnection("url,username,password");
		return con;
	} catch (SQLException | ClassNotFoundException e) {
		
		System.out.println("Database Connected");
		return null;
		
	}
	
	
}


}
