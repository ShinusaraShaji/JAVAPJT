package oops;

import java.util.Scanner;

public class PatternTaskPrblm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=i;j--) {
				System.out.print(i);
			}
			
			System.out.println();
		}

	}

}
