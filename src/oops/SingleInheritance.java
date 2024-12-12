package oops;

//Car-Parent class/Super class
//Bmw-Child class/sub class/derived class

class Car{
	public void displayMethod()
	{
		System.out.println("Cars details");
	}
}
class Bmw extends Car{
	public void bmwDetails()
	{
		System.out.println("BMW Car details");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
	   Bmw ob=new Bmw();
	   ob.displayMethod();// parent class method
	   ob.bmwDetails();// child class method

	}

}
