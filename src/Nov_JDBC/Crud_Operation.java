package Nov_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Crud_Operation {
Connection con =Crud_Operation_Class_Object.createconnection();
public void input(int id,String name,String  City,String sal) {
	try {
		Statement st =con.createStatement();
		   PreparedStatement pt=con.prepareStatement("insert into  emp_info(id,name,City,sal)VALUES(?,?,?,?)");
		   
		   pt.setInt(1, id);
		   pt.setString(2,name );
		   pt.setString(3, City);
		   pt.setString(4, sal);
		   int k=pt.executeUpdate();
		   if(k>0)
		   {
			 System.out.println("Value inserted successfully");  
		   }
		   else {
			   {
					 System.out.println("Value Not  inserted successfully");  

			   }
		}

		   		
	} catch (Exception e) {
		 System.out.println("Database Not Connected");  

	}
	
	
}
public static void main(String[] args) throws ClassNotFoundException {
	
	Crud_Operation ss =new Crud_Operation();
	ss.input(5, "Rahul","Kolhapur","50600");
}
}
