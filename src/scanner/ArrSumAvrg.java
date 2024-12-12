package scanner;

import java.util.Scanner;

public class ArrSumAvrg {

	public static void main(String[] args) {
		// Sum and Average
		
		int[] a=new int[4];
		Scanner sc=new Scanner(System.in);
		int sum=0,avg;
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the values");
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println("sum="+sum+"\n"+"average="+avg);
		}
		

	}


