package Nov_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class password_class {
	static Scanner sc =new Scanner(System.in);
	public static void disp(String user_name,String user_pass) throws ClassNotFoundException {
		
				try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ main_table","root","1234");
			//System.out.println("Database Connected");
			Statement st =con.createStatement();
			ResultSet rs =st.executeQuery("select * from password");
			rs.next();
			String username =rs.getNString(1);
			String userpass =rs.getNString(2);
			if (username.compareTo(user_name)==0 && userpass.compareTo(user_pass)==0) {
				System.out.println("!! Valid Password !!");
				
			} else {
				
				System.out.println("!! Wrong  Password TRy Again .....!!");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Welcome\tGood Try ..Prgress it..");
		}
		
		}
		
public static void main(String[] args) throws ClassNotFoundException {
	
	System.out.println("Enter Your Username");
	String user_name =sc.next();
	System.out.println("Enter Your Password");
	String user_pass =sc.next();
	
	
		disp(user_name, user_pass);
		
	
	
	
}
}
