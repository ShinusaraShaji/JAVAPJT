package oops;

class Birds{
	public void birdsDetails() {
		System.out.println("Birds details");
	}
}
class Hen extends Birds{
	public void henMethod() {
		System.out.println("Hen details");
	}
}
class Dog extends Hen{
	public void DogMethod() {
		System.out.println("Dog details");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
	     Dog ob=new Dog();
	     ob.birdsDetails();
	     ob.henMethod();
	     ob.DogMethod();

	}

}
