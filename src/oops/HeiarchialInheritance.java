package oops;

class Animal{
	public void animalMethod() {
		System.out.println("Animal details");
	}
}
class Deer extends Animal{
	public void deerRun() {
		System.out.println("Deer is running");
	}
}
class Tiger extends Animal{
	public void tigerRoar() {
		System.out.println("Tiger is roaring");
	}
}

public class HeiarchialInheritance {

	public static void main(String[] args) {
		Deer deer=new Deer();
		deer.animalMethod();
		deer.deerRun();
		Tiger tiger=new Tiger();
		tiger.animalMethod();
		tiger.tigerRoar();

	}

}
