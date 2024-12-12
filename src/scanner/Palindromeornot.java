package scanner;

import java.util.Scanner;

public class Palindromeornot {

	public static void main(String[] args) {
		// Palindrome or Not
		
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int temp=x,rev=0;
		while(x!=0)
		{
			int rem=x%10;
			rev=rev*10+rem;
			x=x/10;
		}
		if(temp==rev)
		{
			System.out.println(temp+" is a Palindrome");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome");
		}

	}

}
