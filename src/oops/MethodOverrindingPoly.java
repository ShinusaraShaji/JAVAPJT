package oops;

class ParentC{
	public void job() {
		System.out.println("Engineer");
	}
	public void phone() {
		System.out.println("Samsung");
	}
}

class ChildC extends ParentC{

	@Override
	public void job() {
		System.out.println("Doctor");
		super.job();
	}

	@Override
	public void phone() {
		System.out.println("Nokia");
		super.phone();
	}	
}

public class MethodOverrindingPoly {

	public static void main(String[] args) {
	ChildC ob= new ChildC();
	ob.job();
	ob.phone();

	}

}
// print number including 0 of negative numbers and postive numbers count





