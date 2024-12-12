package methodpgms;

import java.util.Scanner;

public class AreaMethodPgms {

	public static void main(String[] args) {
		AreaMethodPgms ob=new AreaMethodPgms();
		System.out.println("area of square is:"+ob.mul(6,5 ));
		System.out.println("area of rectangle is:"+ob.mul(5, 5, 3));
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of triangle:");
		double a=sc.nextDouble();
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("area of triangle is:"+ob.mul(a, b, h));
		
		
		System.out.println("enter the length:");
		double p=sc.nextDouble();
		int r=sc.nextInt();
		System.out.println("area of circle is:"+ob.mul(p, r));
	

	}
	
	
	// Square
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	
	//Rectangle
	
	public int mul(int l,int b,int h) {
		int c=l*b*h;
		return c;
	}
	
	//Triangle
	
	public double mul(double a,int b,int h) {
		double c=a*b*h;
		return c;
	}
	
	//Circle
	
	public double mul(double p,int r) {
		double k=p*r*r;
		return k;
			
		
	}	

}
