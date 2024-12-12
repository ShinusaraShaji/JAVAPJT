package oops;

class Member { // main class purath
	String name;
	int age;
	int phoneNumber;
	String address;
	double salary;
	
	public void printMethod(){ //method create
		System.out.println("Name: "+name);
		System.out.println("Age : "+age);
		System.out.println("PhoneNumber : "+phoneNumber);
		System.out.println("Address : "+address);
		System.out.println("Salary : "+salary);		
	}
}
class Employee extends Member{
	String Department;			
		
}
class Manager extends Member{

	String Specialization;
}

public class TaskInheritance {

	public static void main(String[] args) {// main method
		Employee e= new Employee();
		e.name="Shinu";
		e.age=21;
		e.phoneNumber=965318609;
		e.address="Pandalam";
		e.salary=25000;
		System.out.println(e.Department="Testing");
		e.printMethod();
		Manager m= new Manager();
		m.name="Jiya";
		m.age=21;
		m.phoneNumber=95175903;
		m.address="Ranni";
		m.salary=35000;
		System.out.println(m.Specialization="Developer");
		m.printMethod();
			
	}

}
