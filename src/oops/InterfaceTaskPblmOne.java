package oops;

import java.util.Scanner;

interface BankApplication{
	public void accountdetails();
	public void balance();
	public void withdraw();
	public void deposit();
}
class Bankdetails implements BankApplication{
	int balance =100000;
	static String bankname="SBI";
	int withdraw;
	int deposit;
	int accountNo;
	Scanner sc=new Scanner(System.in);

	@Override
	public void accountdetails() {
		System.out.println("Enter your account number:");
		accountNo=sc.nextInt();
		System.out.println("Your account details:"+"\n"+accountNo+"\n"+bankname);
			
	}

	@Override
	public void balance() {
		System.out.println("Your current balance is:"+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter amount for withdrawl:");
		withdraw=sc.nextInt();
		balance=balance-withdraw;
		System.out.println("Your final balance is:"+balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter deposit amount:");
		deposit=sc.nextInt();
		balance=balance+deposit;
		System.out.println("Your final balance is:"+balance);
		
	}	
}

public class InterfaceTaskPblmOne {

	public static void main(String[] args) {
		Bankdetails ob=new Bankdetails();
		ob.accountdetails();
		ob.balance();
		ob.withdraw();
		ob.deposit();

	}
}
