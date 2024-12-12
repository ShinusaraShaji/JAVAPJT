package packge;

public class Operator {

	public static void main(String[] args) {
		// Arithmetic Operators
		int a=40,b=30;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		//Assignment Operators
		int c=a;
		System.out.println((a+=b));//a=a+b 40+30=70
		System.out.println((a-=b));//a=a-b 70-30=40
		
		//Relational Operators
		
		System.out.println((a==b));
		System.out.println((a<b));
		System.out.println((a<=b));
		System.out.println((a>b));
		System.out.println((a>=b));
		System.out.println((a!=b));
		
		//Logical Operators
	    //   A      B     A&&B     A||B     !A       !B
		//   0      0      0         1       1        1
		//   1      0      0         1       0        1
		//   0      1      0         1       1        0
		//   1      1      1         1       0        0
		
		
		 String username="abc";
		 String password="abc123";
		 System.out.println((username=="abc")&&(password=="abc123"));
		 System.out.println((username=="cde")||(password=="abc124"));
		 System.out.println(!(username=="abc1"));
		 System.out.println(!(password=="abc125"));
		 
		 //Unary Operators
		     
		     int c1=10,c2=20;
		 //c1++post increment
		 //++c1 pre increment
		     
		     System.out.println(c1++);//10
		     System.out.println(c1);//11
		     System.out.println(++c1);//12
		     System.out.println(--c1);//11
		     
		     
		   //Ternary Operators
		   // Syntax- variable=condition?exp1:exp2;
		     
		     String v=c2>c1?"c2 is larger":"c1 is larger";
		     System.out.println(v);
		     
		 
		 
		 
		 
		 
		
		
		

	}

}
