package Project;

import java.lang.reflect.Method;
import java.util.Scanner;

/*Bank Management Software

1. Check Balance
2. Deposit Amount
3. Withdraw Amount
4. Previous Transaction
5. Exit

input: enter name and customer id to access the bank account:

*/
public class Bank_Mangement_Soft {
	int Balance=1500;
	int withdraw;
	int deposit;
	public void structre() {
		System.out.println("Welcome to Bank Managemet System");
		System.out.println("a)Check Balance");
		System.out.println("a)Deposite Amount");
		System.out.println("a)Withdraw");
		System.out.println("a)Previous Transaction");
		
	}
	public void checkbalance() {
		
		System.out.println(Balance);
	}
	public void depositeamount() {
		
		
	}
	public void withdraw() {
		
		
	}
	public void previous() {
		
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose an Option");
	int n=sc.nextInt();
	Bank_Mangement_Soft ss=new Bank_Mangement_Soft();
	ss.structre();
	
	switch (n) {
	case 1: {
			ss.checkbalance();
		break;
	}
	case 2: {
		ss.depositeamount();
		break;
	}
	case 3: {
		ss.withdraw();
		break;
	}
	case 4: {
		ss.previous();
		break;
	}
	}
	Default:

		System.out.println("Wrong Choice");
	
	}

}

