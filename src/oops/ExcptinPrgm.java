package oops;

public class ExcptinPrgm {

	public static void main(String[] args) {
		
		try 
		{
			int c=5/0;
		System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Hello Hi");
		try
		{
			
		String s=null;//unchecked exception
		System.out.println(s.length());
	    }
		catch(NullPointerException e1)
		{
			System.out.println("Error message");
		}
		try
		{
			int[]ar=new int[2];
			ar[0]=1;
			ar[1]=2;
			ar[2]=3;
		}
		catch(Exception e2)
		{
			System.out.println(e2.getMessage());
		}
	}
}
