package Banking_Mangement_Software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Banking_Project_Operation {
Connection con=Banking_Project_Connection.Datainfo();
Scanner sb=new Scanner(System.in);
public boolean login() {
	try {
		
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter user name");
    	 int user=sc.nextInt();
    	 
    	 System.out.println("Enter pass");
    	 String pass=sc.next();
    	 
    	 boolean status=false;
    	 
    	 String query="select *from bank  where id=? and name=?";
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
    		 System.out.println("Login succeaafully");
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
int balance	=0;
public void checkbalance() {
	
	System.out.println("Your Balance is="+balance);
}
int depositamount;
public void depositeamount() {
System.out.println("Enter Deposit Amount");
depositamount=sb.nextInt();
int result=balance+depositamount;
System.out.println(result);
	
}
int wd;
public void withdraw() {
	System.out.println("Enter your Withdral Amount");
	wd =sb.nextInt();
	int wr=depositamount-wd;
	System.out.println("Your Withdral"+wr);
	
}
public void previous() {
	
	System.out.println(wd);
}
public static void main(String[] args) {
	Scanner sp=new Scanner(System.in);
	Banking_Project_Operation aa=new Banking_Project_Operation();
	if(aa.login()==true)
	{
		System.out.println("Welcome to Banking  Managemet Software");
		System.out.println("!!!!!=================================!!!!!");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" Press 1 To Check Balance");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Press 2 To Deposite Amount");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Press 3 To Withdraw");
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Press1 4 To Previous Transaction");
	char ch;
	do {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("Enter Your Choice");
	int n=sp.nextInt();
	switch (n) {
	case 1:
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aa.checkbalance();
		break;
	
	case 2: 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		aa.depositeamount();
		break;
	
	case 3: 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aa.withdraw();
		break;
	
	case 4: 
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		aa.previous();
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
	System.out.println("\nDO you Want to Continue the operations ?"+"\nPreaa 'Y' or 'y"+"\nIF Exist 'N' or'n");
	ch=sp.next().charAt(0);
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
		
			if(aa.login()==false)
			{
				aa.login();
			}
			else 
				{
				System.out.println(" Press 1 To Check Balance");
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
				System.out.println("Preaa 3 To Deposite Witraw");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Press 4 To Previous Transaction");
				char ch;
				do {
					
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				System.out.println("Enter Your Choice");
				int n=sp.nextInt();
				switch (n) {case 1:
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					aa.checkbalance();
					break;
				
				case 2: 
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
					}
					aa.depositeamount();
					break;
				
				case 3: 
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					aa.withdraw();
					break;
				
				case 4: 
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					aa.previous();
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
				System.out.println("\nDO you Want to Continue the operations ?"+"\nPreaa 'Y' or 'y"+"\nIF Exist 'N' or'n");
				ch=sp.next().charAt(0);
				}while(ch=='Y'||ch=='y');
				
					if (ch!='Y'||ch!='y') {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Operation Exit");
					}
				}
			}
	}
	
}
