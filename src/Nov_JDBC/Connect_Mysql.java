package Nov_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connect_Mysql 
{
	
	 public static void main(String args[]) throws ClassNotFoundException
	 
	    {
		 Scanner sc=new Scanner(System.in);
		 Scanner sc1=new Scanner(System.in);
		 System.out.println("Enter Id Position");
		 int pos1=sc.nextInt();
		 System.out.println("Enter Name Position");
		 int pos2=sc.nextInt();
		 System.out.println("Enter Salary Position");
		 int pos3=sc.nextInt();
		 
		 System.out.println("Enter Id");
		 int id=sc.nextInt();
		 System.out.println("Enter Salary");
		 double sal=sc.nextDouble();
		 System.out.println("Enter Name");
		 String name=sc1.nextLine();
	        try
	           {
	           Class.forName("com.mysql.cj.jdbc.Driver");
	          Connection   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/november","root","1234");
	          	Statement st=con.createStatement();
	          	PreparedStatement pt=con.prepareStatement("Insert Into  emp(id ,name,salary)VALUES(?,?,?)");
	          	pt.setInt(pos1, id);
	          	pt.setString(pos2, name);
	          	pt.setDouble(pos3,sal);
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


	    }

}
