package oopscncpt;

import java.util.Scanner;

interface bank
{
	public void accounntdetails();
	public  void balance();
	public void withdraw();
	public void deposit();
}

class SBI implements bank
{
	Scanner sc = new Scanner(System.in);
	double balance = 10000;
	@Override
	public void accounntdetails() {
		System.out.println("Enter your name :");
		String s = sc.nextLine();
		System.out.println("Enter your mobile no :");
		long m = sc.nextLong();
		System.out.println("Your Account details are :");
		System.out.println("Banking Name : "+s);
		System.out.println("Mobile No : "+m);
		System.out.println("Account no : 1156465411");
		System.out.println("IFSC Code : SBI01478");
		
	}

	@Override
	public void balance() {
		System.out.println("Account Balance :"+balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter the amount to withdraw :");
		double wd=sc.nextDouble();
		balance = balance - wd;
		System.out.println("Your current balance : "+balance);
		
		
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter the amount to deposit :");
		double d=sc.nextDouble();
		balance = balance + d;
		System.out.println("Your current balance : "+balance);
		
	}
	
}
public class OopsPrgrm {

	public static void main(String[] args) {
		SBI ob = new SBI();
		ob.accounntdetails();
		ob.balance();
		ob.withdraw();
		ob.deposit();
		
		

	}

}
