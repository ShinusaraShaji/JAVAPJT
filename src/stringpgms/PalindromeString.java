package stringpgms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a String value");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
	if(rev.equalsIgnoreCase(s))
	{
		System.out.println("Entered String is Palindrome");
	}
	else {
		System.out.println("Entered String is not Palindrome");
	}

	}

}
