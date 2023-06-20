package Project;

import java.util.Scanner;

/*Word Counter Application using java 

Functionalities:
1. take input string as much as need 
2. print the total count of word taken by the user.*/
public class String_Count {
	public void input(String Str) {
		System.out.println("Your String Is..");
		System.out.println(Str);
		String[] s=Str.split(" ");
		int c=0;
		for (int i = 0; i < s.length; i++) {
			c++;
		}
		System.out.println("Your String Count is="+c);
		
	}
public static void main(String[] args) {
	Scanner sc	=new Scanner(System.in);
	System.out.println("Enter Your String");
	String Str=sc.nextLine();
	String_Count ss	=new String_Count();
	ss.input(Str);
}
}
