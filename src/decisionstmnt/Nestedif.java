package decisionstmnt;

public class Nestedif {

	public static void main(String[] args) {
		int num=55;
		if (num%5==0)
		{
			if (num%11==0) 
		{
				
			System.out.println(num +" is divisible by 5 and 11");
		}
		else
		{
			System.out.println(num +" is divisible by 5 but not divisible by 11");
		}
	    }
	   else
	    {
		   System.out.println(num +" is not divisible by 5 and 11");
		}

	}

}
