package Project_Employee_Mangement_System;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee_Crud_Operation {
	Scanner sp=new Scanner(System.in);
	Connection con=Employee_Connectoin.Datainfo();
	public boolean login() {
		try {
			
	    	 String url="jdbc:mysql://localhost:3306/main_table";
	    	 String username="root";
	    	 String password="1234";
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection con=DriverManager.getConnection(url,username,password);
	    	 
	    	 Scanner sc=new Scanner(System.in);
	    	 
	    	 
	    	 System.out.println("Enter user name");
	    	 int user=sc.nextInt();
	    	 
	    	 System.out.println("Enter pass");
	    	 String pass=sc.next();
	    	 
	    	 boolean status=false;
	    	 
	    	 String query="select *from  Employee_Management_System where cid=? and First_name=?";
	    	 PreparedStatement ps=con.prepareStatement(query);
	    	 ps.setInt(1, user);
	    	 ps.setString(2, pass);
	    	 
	    	 ResultSet rs=ps.executeQuery();
	    	 status=rs.next();
	    	 
	    	 if(status) {
	    		 try {
	    				Thread.sleep(1000);
	    			} catch (InterruptedException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		 System.out.println("Login successfully");
	    		 return true;
	    	 }else {
	    		 try {
	    				Thread.sleep(1000);
	    			} catch (InterruptedException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    		 System.out.println("Login failed try again!!!!");
	    	 }
	    
	    	 
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
		
	}	
	public void insertion(int id,String First_name,String Last_name,String  department,int  salary ,String city ,String state ,String country) {
		try {
			Statement st=con.createStatement();
			PreparedStatement pt=con.prepareStatement("insert into Employee_Management_System(cid,First_name,Last_name,department,salary,city,state,country)Values(?,?,?,?,?,?,?,?)");
			pt.setInt(1, id);
			pt.setString(2,  First_name);
			pt.setString(3,  Last_name);
			pt.setString(4, department);
			pt.setInt(5, salary);
			pt.setString(6,city  );
			pt.setString(7, state);
			pt.setString(8, country);
			int k=pt.executeUpdate();
			if (k>0) {
				System.out.println("Value Inserted");
			} else {
				System.out.println("Value Not  Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void updation() {
			try {
				Statement st=con.createStatement();
				System.out.println("Enter cid to update information");
				int updateid=sp.nextInt();
				
			    char ch;
			     
			     do {
			    	 System.out.println("Option for updation: \n\t1.First_Name\n\t2.Last_Name\n\t3. department\n\t4.Salary\n\t5.City\n\t6.State\n\t7.Country");
				     int option=sp.nextInt();
			     switch(option)
			     {
			     case 1:
			    	 System.out.println("enter First_name");
					    String firstname=sp.next();
						 PreparedStatement ps=con.prepareStatement("UPDATE employee_management_system SET  First_name="+"'"+firstname+"'"+"WHERE  cid="+updateid);
						 
						 int k=ps.executeUpdate();
							if(k>0)
								System.out.println(k+" " +"First_Name update sucessfully");
							else
								System.out.println("fail to update");
						 break;
			     case 2:
			    	 System.out.println("enter Last_name");
			    	 String lastname=sp.next();
			    	 PreparedStatement ps1=con.prepareStatement("UPDATE employee_management_system SET  Last_name="+"'"+lastname+"'"+"WHERE  cid="+updateid);
			    	 
			    	 int k1=ps1.executeUpdate();
			    	 if(k1>0)
			    		 System.out.println("Last_Name update sucessfully");
			    	 else
			    		 System.out.println("fail to update");
			    	 break;
						 
			     case 3:
			    	 System.out.println("enter department");
					    String department=sp.next();
					    PreparedStatement ps2=con.prepareStatement("UPDATE  employee_management_system SET department="+"'"+department+"'"+"WHERE cid="+updateid);
					    
					    int k2=ps2.executeUpdate();
						if(k2>0)
							System.out.println("department update sucessfully");
						else
							System.out.println("fail to update");
					    break;
					    
			     case 4:
			    	 System.out.println("enter salary");
					   int sal=sp.nextInt();
					    PreparedStatement ps3=con.prepareStatement("UPDATE employee_management_system SET  salary"
					    		+ "="+"'"+sal+"'"+"WHERE  cid="+updateid);
					    int k3=ps3.executeUpdate();
						if(k3>0)
							System.out.println("salary update sucessfully");
						else
							System.out.println("fail to update");
					    break;
			     case 5:
			    	    System.out.println("enter City");
					    String updatecity=sp.next();
					    PreparedStatement ps4=con.prepareStatement("UPDATE employee_management_system SET  city ="+"'"+updatecity+"'"+"WHERE cid="+updateid);
					    int k4=ps4.executeUpdate();
					    if(k4>0)
							System.out.println("City  update sucessfully");
						else
							System.out.println("fail to update");
					    break;
			     case 6:
			    	 System.out.println("enter your state");
					    String state=sp.next();
					    PreparedStatement ps5=con.prepareStatement("UPDATE employee_management_system SET state="+"'"+state+"'"+"WHERE cid="+updateid);
					    int k5=ps5.executeUpdate();
					    if(k5>0)
							System.out.println("salary update sucessfully");
						else
							System.out.println("fail to update");
					    break;
			     case 7:
			    	 System.out.println("enter your Country");
			    	 String country=sp.next();
			    	 PreparedStatement ps6=con.prepareStatement("UPDATE employee_management_system SET  country="+"'"+country+"'"+"WHERE cid="+updateid);
			    	 int k6=ps6.executeUpdate();
			    	 if(k6>0)
			    		 System.out.println("country update sucessfully");
			    	 else
			    		 System.out.println("fail to update");
			    	 break;
			    	 default:
			    		 System.out.println("Wrong input");
			     }
			     
			     System.out.println("\n Do you want to continue the task?"+"\nIf yes press 'Y'or 'y'"+"\nIf No press 'N'or 'n'");
		         ch=sp.next().charAt(0);
			     }while(ch=='Y' || ch=='y');
		         
	         if(ch!='Y' || ch!='y')
	       	System.out.println("operation Exit");
				
			     }
				
			     catch (Exception e)
			     {
				
				System.out.println(e);
			     
			     
			     }
	
	}
	public void deletion() {
		try {
			System.out.println("Enter You Want Delete Id");
		int	deleteid=sp.nextInt();
			Statement st=con.createStatement();
			PreparedStatement pt=con.prepareStatement("delete from  Employee_Management_System where cid="
					+deleteid+"");
			
			int k=pt.executeUpdate();
			if(k>0)
			{
			System.out.println("Value deleted");
			}else {
				System.out.println("Value Not deletd");
					
				
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	public void fetch() {
		try 
		{
			Statement st=con.createStatement();
		
			ResultSet rs=st.executeQuery("select * from Employee_Management_System");
			System.out.println("\tId\tName\t");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5)+"\t\t"+rs.getString(6)+"\t\t"+rs.getString(7)+"\t\t"+rs.getString(8));
			}
		} catch (SQLException e) {
			System.out.println("Not Connect");
		}
		

	}
public static void main(String[] args) {
	
Scanner sc	=new Scanner(System.in);
	Employee_Crud_Operation ss=new Employee_Crud_Operation();
	
	if(ss.login()==true)
	{
	System.out.println("Press 1 :To Insertion");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Press 2 :To Updatation");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Press 3 :To Deletion");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Press 4 :To Fetch");
	char ch;
	do {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("Enter Your Choice");
	int n=sc.nextInt();
	switch (n) {
	case 1:
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please Enter Unique Id Duplicate Or Null not allows!!!!!");
		System.out.println("\nEnter Id");
		int id=sc.nextInt();
		System.out.println("\nEnter First_name ");
		String First_name =sc.next();
		System.out.println("\nEnter Last_name ");
		String Last_name =sc.next();
		System.out.println("\nEnter  department ");
		String  department  =sc.next();
		System.out.println("Enter salary  ");
		int  salary    =sc.nextInt();
		System.out.println("Enter  city   ");
		String city    =sc.next();
		System.out.println("Enter  state    ");
		String state     =sc.next();
		System.out.println("Enter  country   ");
		String country   =sc.next();
		ss.insertion(id,First_name,Last_name,department,salary,city,state ,country  );
		break;
	
	case 2: 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ss.updation();
		break;
	
	case 3: 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ss.deletion();
		break;
	
	case 4: 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ss.fetch();
		break;
	
	default:
		System.out.println("Wrong Choice");
	}
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("\nDO you Want to Continue the operations ?"+"\nPress 'Y' or 'y"+"\nIF Exist 'N' or'n");
	ch=sc.next().charAt(0);
	}while(ch=='Y'||ch=='y');
	
		if (ch!='Y'||ch!='y') {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Operation Exist");
		}
	}
	else {
		
			if(ss.login()==false)
			{
				ss.login();
			}
			else 
				{
				System.out.println("Press 1 :To Insertion");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Press 2 :To Updatation");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Press 3 :To Deletion");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Press 4 :To Fetch");
				char ch;
				do {
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				System.out.println("Enter Your Choice");
				int n=sc.nextInt();
				switch (n) {
				case 1:
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Please Enter Unique Id Duplicate Or Null not allows!!!!!");
					System.out.println("\nEnter Id");
					int id=sc.nextInt();
					System.out.println("\nEnter First_name ");
					String First_name =sc.next();
					System.out.println("\nEnter Last_name ");
					String Last_name =sc.next();
					System.out.println("\nEnter  department ");
					String  department  =sc.next();
					System.out.println("Enter salary  ");
					int  salary    =sc.nextInt();
					System.out.println("Enter  city   ");
					String city    =sc.next();
					System.out.println("Enter  state    ");
					String state     =sc.next();
					System.out.println("Enter  country   ");
					String country   =sc.next();
					ss.insertion(id,First_name,Last_name,department,salary,city,state ,country  );
					break;
				
				case 2: 
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ss.updation();
					break;
				
				case 3: 
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ss.deletion();
					break;
				
				case 4: 
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					ss.fetch();
					break;
				
				default:
					System.out.println("Wrong Choice");
				}
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("\nDO you Want to Continue the operations ?"+"\nPress 'Y' or 'y"+"\nIF Exist 'N' or'n");
				ch=sc.next().charAt(0);
				}while(ch=='Y'||ch=='y');
				
					if (ch!='Y'||ch!='y') {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Operation Exist");
					}
				}
			}
	}
	
}



