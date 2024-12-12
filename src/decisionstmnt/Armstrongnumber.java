package decisionstmnt;

public class Armstrongnumber {

	public static void main(String[] args) {
		// Armsrtong number
		 int n=153,res=0,r=0,t;// n=256 o/p-not an armstrong number
		 t=n;
		 while(n>0) {
			 r=n%10;//153/10=3 //15/10=5 //1/10=1
			 res+=(r*r*r);//0+27=27 //27+125=152 //152+1=153
			 n=n/10;//153/10=15 //15/10=1 //1/10=0
		 }
		 if(t==res)
			 System.out.println("Armstrong number");
		 else
			 System.out.println("Not an armstrong number");
		 

	}

}
