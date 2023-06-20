package Nov_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_connection {
    public static void main(String args[]) throws ClassNotFoundException
    {
        try
           {
              Class.forName("com.mysql.cj.jdbc.Driver");
          Connection   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/november","root","1234");

       System.out.println(" !!! Database is connected !!!");
                   
            }
       catch(SQLException e){
    	   System.out.println("Database is  not connected"); 
    	   }


    }

}
