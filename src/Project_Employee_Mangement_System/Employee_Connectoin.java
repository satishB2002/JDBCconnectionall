package Project_Employee_Mangement_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee_Connectoin {
	
public static Connection Datainfo() {
	
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ main_table","root","1234");
		System.out.println("Database is Connected");
		return con;
	} catch (Exception e) {
		System.out.println("Database Not Connected");
		return null;
		
	}
	
}
}
