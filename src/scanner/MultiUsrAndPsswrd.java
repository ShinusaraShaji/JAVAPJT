package scanner;

import java.util.Scanner;

public class MultiUsrAndPsswrd {

	public static void main(String[] args) {
		// Display Username and Password
		
		String[][] arr=new String[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username and password:");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.next();
				
			}
		}
		System.out.println("Entered username and password is : \n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
			}
		}

	}


