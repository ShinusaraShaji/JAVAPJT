package oops;

abstract class Cars{
	abstract public void acceleration();
	
	public void CarEngine(){
		System.out.println("Engine details");
	}
}

class Kia extends Cars{

	@Override
	public void acceleration() {
		System.out.println("Kia acceleration");
	 }
	
	}
class Maruti extends Cars{

	@Override
	public void acceleration() {
		System.out.println("Maruti acceleration");
			
		}	
	}

public class AbstractionPrgm {

	public static void main(String[] args) {
		
		Kia ob=new Kia();
		ob.acceleration();
		ob.CarEngine();
		Maruti ob1=new Maruti();
		ob1.acceleration();
		ob1.CarEngine();
	
	
	}
}






