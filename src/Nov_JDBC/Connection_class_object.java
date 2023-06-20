package Nov_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connection_class_object {
	
	public static Connection connectDatabase() throws ClassNotFoundException 
 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String user_name = sc.nextLine();
		System.out.println("Enter Password");
		String user_pass = sc.next();
	try
    {

       Class.forName("com.mysql.cj.jdbc.Driver");
   Connection   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/november",user_name,user_pass);
   Statement st =con.createStatement();
   PreparedStatement pt=con.prepareStatement(user_pass);
	int k=pt.executeUpdate();
    if (k>0) {
		System.out.println("Data inserted="+k);
	} else {
		System.out.println("Data Not inserted");
	}

      }

 catch(SQLException e){
	   System.out.println("Data Not inserted"); 
	   }
	return null;

     
   
}



}
