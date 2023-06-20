package Nov_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Class_Object_updation_main {
	Connection con =Class_Object_Updation.connectData();
	public void peek() {
		try {
			Statement st =con.createStatement();
			PreparedStatement pt=con.prepareStatement("update emp_info set name='PK' where id=4");
			int k=pt.executeUpdate();
			if (k>0) {
			System.out.println(k+"Value Inserted");
			} else {
				System.out.println(k+"Value Not Inserted");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Database Is not Connected");
		}
	}
	public void deletion() {
		try {
			Statement st =con.createStatement();
			PreparedStatement pt=con.prepareStatement("delete ");
			int k=pt.executeUpdate();
			if (k>0) {
			System.out.println(k+"Value Inserted");
			} else {
				System.out.println(k+"Value Not Inserted");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Database Is not Connected");
		}
		
	}
	public static void main(String[] args) {
		Class_Object_updation_main  ss =new Class_Object_updation_main ();
		ss.peek();
	}

}
