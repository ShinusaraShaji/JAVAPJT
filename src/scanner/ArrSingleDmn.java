package scanner;

import java.util.Scanner;

public class ArrSingleDmn {

	public static void main(String[] args) {
		
		int[] arr=new int[3];
		System.out.println("Enter the numbers:");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<=2;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered numbers are");
		for(int i=0;i<=2;i++)
		{
			System.out.println(arr[i]);
		}
		}

	

}
