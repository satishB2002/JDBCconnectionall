package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Word_Counter_Application_main {
	Connection con =Word_Counter_Application.appmethod();
	public void input(String Str) {
		try {
			Statement st =con.createStatement();
			   PreparedStatement pt=con.prepareStatement("insert into  string(input)VALUES(?)");
			   pt.setString(1, Str);
			   int c=0;
			  String[] s=Str.split(" ");
			  for (int i = 0; i < s.length; i++) {
				c++;
			}
			  System.out.println(c);
			  
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
	public static void main(String[] args) {
		Scanner sc	=new Scanner(System.in);
		System.out.println("Enter Your String");
		String Str=sc.nextLine();
		Word_Counter_Application_main ss =new Word_Counter_Application_main();
		ss.input(Str);
	}
	}
