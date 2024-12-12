package oops;

public class ConstrtEmployee {
	int empid;
	String empname;
	
	public ConstrtEmployee(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}

	public static void main(String[] args) {
		
		ConstrtEmployee emp=new ConstrtEmployee(10,"Rigved");
		System.out.println(emp.empid);
		System.out.println(emp.empname);
		
		

	}

}
