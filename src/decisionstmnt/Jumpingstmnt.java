package decisionstmnt;

public class Jumpingstmnt {

	public static void main(String[] args) {
		// Jumping statement(break)
		
		for(int i=1;i<10;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
			
		}
		
		
		//continue
		
		for(int i=1;i<10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
			
		}
		

	}

}
