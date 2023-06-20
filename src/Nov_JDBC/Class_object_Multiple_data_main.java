package Nov_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Class_object_Multiple_data_main {
	Connection con =Class_object_Multiple_data.data();
public void part(int id,String name,String city,String sal) {
	try {
		Statement st =con.createStatement();
		PreparedStatement pt=con.prepareStatement("insert into emp_info (id,name,city,sal)VALUES(?,?,?,?)");
		pt.setInt(1, id);
		pt.setString(2, name);
		pt.setString(3, city);
		pt.setString(4, sal);
		int k=pt.executeUpdate();
		if(k>0)
		{
			System.out.println("Value Inserted");
		}else 
			{
				
			System.out.println("Value Not Inserted");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Not Connected");
	}
	
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Class_object_Multiple_data_main ss=new Class_object_Multiple_data_main();
	int id;
	String name;
	String city;
	String sal;
	
	for(int i=1;i<=2;i++)
	{
		System.out.println("Enter Info");
		id=sc.nextInt();
		name=sc.next();
		city=sc.next();
		sal=sc.next();
		
	ss.part(id,name,city,sal);
	}
}
}
