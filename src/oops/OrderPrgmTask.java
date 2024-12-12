package oops;

import java.util.Scanner;

public class OrderPrgmTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		System.out.println("Enter third number:");
		int num3=sc.nextInt();
		if(num1<num2 && num2<num3) {
			System.out.println("Increasing");}
		else if(num1>num2 && num2<num3) {
			System.out.println("Decreasing");}
		else {
			System.out.println("Neither increasing nor decreasing order");
		}

	}

}
