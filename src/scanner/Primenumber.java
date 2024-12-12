package scanner;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// 5. Prime number
		
		System.out.println("Enter a positive integer:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=1) {
			System.out.println(num+ " is not a prime number.");
		}
		else {
			boolean isPrime=true;
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num% i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num + " is a prime number.");
			}else {
				System.out.println(num + " is not a prime number.");
				}
			}
		}
				
}
		

	


		
		
		
		

	


