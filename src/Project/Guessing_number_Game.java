package Project;

import java.util.Scanner;

public class Guessing_number_Game {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int r=(int)(Math.random()*100+1);
	int c=1,k=0;

	System.out.println("user enter no 1 to 100");
	while(true)
	{
		int n=sc.nextInt();
		if(n==r)
		{
			k=1;
			break;
		}
		else if(n>r)
			System.out.println("your guess is too high, try again");
		else
			System.out.println("your guess is too low, try again" );
		c++;
		
	}
	if(k==1)
	System.out.println("correct guess and count is "+c);
	
		
	
	
}
}
