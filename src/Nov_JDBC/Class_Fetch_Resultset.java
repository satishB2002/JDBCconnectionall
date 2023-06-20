package Nov_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Class_Fetch_Resultset {
public static void main(String[] args) throws ClassNotFoundException {
	   try
	      {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/november","root","1234");

	       System.out.println("Database is Connected");
	       //Creating a reference var of a statement
	       Statement st=con.createStatement();
	     
	      /* PreparedStatement ps=con.prepareStatement(
	    		   "Delete from emp_info where id=2"
	    		   );  
	      
	       
	       //It is for execution
	       int k=ps.executeUpdate();
	       
	       if(k>0)
	    	   System.out.println(k+" "+"Data Entries Deleted");
	       else
	    	   System.out.println("No record deleted");*/
	       ResultSet rs =st.executeQuery("Select * from  emp_info");
	       System.out.println("ID\tName\tCity\tSalary");
	       rs.next();
	       rs.absolute(3);
	       System.out.println(rs.getInt(1)+"\t"+rs.getNString(2)+"\t"+rs.getNString(3)+"\t"+rs.getNString(4));
//	       while(rs.next())
//	       
//	       {
//	    	   System.out.println(rs.getInt(1)+"\t"+rs.getNString(2)+"\t"+rs.getNString(3)+"\t"+rs.getNString(4));
//	       }
//	       
	      }
	      catch(SQLException e)
	       {
	          System.out.println("NO record deleted");
	       }
	}



}
