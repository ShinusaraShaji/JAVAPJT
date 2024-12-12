package packge;

public class Equalitycheck {

	public static void main(String[] args) {
		int a=23;
		int b=45;
		System.out.println(a==b?"Equal":"Not equal");	

		//2.
		
		int c=55;
		int d=70;
		
		System.out.println(((c<50)&&(c<d)==true));
	    System.out.println();
	    
	    
	    //3.
	    
	    int h=20;
	    int i=30;
	    System.out.println("Value of a and b before swapping is "+h+" "+i+"respectively");
	    h=h+i;
	    i=h-i;
	    h=h-i;
	    System.out.println("Value of a and b after swapping is "+h+" "+i+"respectively");
	    System.out.println();
	    
	    //4.
	    
	    int p=17;
		System.out.println("The second digit of"+p+" is "+p%10);

		
	    
	
		
				

	}

}
