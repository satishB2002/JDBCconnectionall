package Jdbc_Connection_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.exceptions.PacketTooBigException;
import com.mysql.cj.xdevapi.Statement;

import Nov_JDBC.Class_Object_Updation;
public class B {
	Connection con =Class_Object_Updation();
	public void input()
	{
		try {
			
			PreparedStatement pt =con.prepareStatement("insert into dept(id,department_name,emp_id)values(?,?,?)");
			pt.setInt(1, 78);
			pt.setString(2, "ASDF");
			pt.setInt(3, 111);
			int k=pt.executeUpdate();
			if (k>0) {
				System.out.println("Value Inserted");
			} else {
				System.out.println("Value Not Inserted");
			}
		} catch (Exception e) {
			System.out.println("Database Not Connected");
	
		}
		
	}
	private Connection Class_Object_Updation() {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args) {
		B ss=new B();
		ss.input();
	}
}
