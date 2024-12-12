package scanner;

import java.util.Scanner;

public class Simplecalculator {

	public static void main(String[] args) {
		// 
		
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch)
		{
		case'+':System.out.println(a+b);
		break;
		case'-':System.out.println(a-b);
		break;
		case'*':System.out.println(a*b);
		break;
		case'/':System.out.println(a/b);
		break;
		default:System.out.println("Invalid");
			
		}
		

	}

}
