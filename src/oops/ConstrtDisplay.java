package oops;

public class ConstrtDisplay {
	int empid;
	String empname;
	
	
	public ConstrtDisplay(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	
	public void display()
	{
		System.out.println("Employee id="+empid);
		System.out.println("Employee name="+empname);
	}

	
	public static void main(String[] args) 
	{
		ConstrtDisplay emp=new ConstrtDisplay(10,"Rigved");
		emp.display();
	}
}
