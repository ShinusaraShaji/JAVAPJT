package scanner;

import java.util.Scanner;

public class NegativendPostive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int zeroCount=0;
		int positiveCount=0;
		int negativeCount=0;
		System.out.println("Enter 5 numbers:");
		for(int i=0;i<5;i++) {
			int num=sc.nextInt();
			if(num==0) {
				zeroCount++;}
			else if(num>0) {
			
				positiveCount++;
			}
			else {
				negativeCount++;	
			}
		}
		System.out.println("Zero count: "+ zeroCount);
		System.out.println("Positive numbers:"+ positiveCount);
		System.out.println("Negative numbers:"+ negativeCount);		

	}
}
