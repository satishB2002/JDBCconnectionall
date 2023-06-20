package Jdbc_Connection;

import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.xdevapi.Statement;

import Jdbc_Connection.ConnectionJDBC;

public class Data_insertion {
	Scanner sc	= new Scanner(System.in);
	Connection con	=ConnectionJDBC.Ss();
	public void Datainsertion( )
	{
		int id ;
		String name; 
		String city; 
		String state; 
		System.out.println("Enter Your ID");
		id =sc.nextInt();
		System.out.println("Enter Your Name");
		name =sc.next();
		System.out.println("Enter Your City");
		city =sc.next();
		System.out.println("Enter Your State");
		state =sc.next();
		try {
			java.sql.Statement	st = con.createStatement();
			PreparedStatement pt = con.prepareStatement("insert into  tiger VALUES(?,?,?,?)");
			pt.setInt(1, id);
			pt.setString(2, name);
			pt.setString(3, city);
			pt.setString(4, state);
			int k=pt.executeUpdate();
			if (k > 0) {
				System.out.println("Value Inserted");
			} else {
				System.out.println("Value Not Inserted");
			}
			
		} catch (Exception e) {
		System.out.println(e);
		}
	}
	public void DataUpdation()
	{
		try {
			java.sql.Statement	st = con.createStatement();
			System.out.println("Enter Your Id to Update Information");
			int id2=sc.nextInt();
			char ch;
			do {
				System.out.println("Enter Your Choice");
				int	option=sc.nextInt();
				switch (option) {
				case 1: {
					System.out.println("Enter Your Name");
					String name	=sc.next();
					PreparedStatement pt	=con.prepareStatement("update tiger set name=name where id=id2");
					int k=pt.executeUpdate();
					if (k>0) {
						System.out.println("Name Is Updated");
					} else {
					System.out.println("Name Is Not Updated");
					}
				break;	
				}
//				case 2: {
//					System.out.println("Enter Your City");
//					String city	=sc.next();
//					PreparedStatement pt=con.prepareStatement("UPDATE tiger SET  city=\"+\"'\"+city+\"'\"+\"WHERE  id=\"+id2);");
//					int k=pt.executeUpdate();
//					if (k>0) {
//						System.out.println("City Is Updated");
//					} else {
//					System.out.println("City Is Not Updated");
//					}
//					break;	
//				}
//				case 3: {
//					System.out.println("Enter Your State");
//					String state	=sc.next();
//					PreparedStatement pt=con.prepareStatement("UPDATE tiger SET  state=\"+\"'\"+state+\"'\"+"WHERE  \id=\"+id2);");
//					int k=pt.executeUpdate();
//					if (k>0) {
//						System.out.println("State Is Updated");
//					} else {
//					System.out.println("State Is Not Updated");
//					}
//					break;		
				
				default:
					System.out.println("Wrong Choice");
				}
				 System.out.println("\n Do you want to continue the task?"+"\nIf yes press 'Y'or 'y'"+"\nIf No press 'N'or 'n'");
		         ch=sc.next().charAt(0);
			} while (ch=='Y' || ch=='y');
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
public static void main(String[] args) {
	
	Data_insertion sl	=new Data_insertion();
	//sl.Datainsertion();
	sl.DataUpdation();
}
}
