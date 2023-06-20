package Jdbc_Connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionJDBC {
public static Connection Ss()
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection	con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Connect","root","1234");
		System.out.println("Database Connected ");
		return con;
	} catch (Exception e) {
				System.out.println(e);
				System.out.println("Database Not Connected ");
				return null;
	}


}
}
