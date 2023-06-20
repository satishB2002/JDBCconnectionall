package Nov_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Crud_operation_Deletion_main {
	
public void display() {
	Connection con =Class_Object_deltion.ConnectData();
	try {
		Statement st =con.createStatement();
		PreparedStatement pt =con.prepareStatement("delete from emp_info where id=5");
		int k=pt.executeUpdate();
		if(k>0)
		{
			System.out.println("Row Deleted");
		}
		else {
			System.out.println("Row not Deleted");
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	
}
	public static void main(String[] args) {
		Crud_operation_Deletion_main ss =new Crud_operation_Deletion_main();
		ss.display();

	}

}
