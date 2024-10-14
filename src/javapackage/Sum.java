package javapackage;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		char st;
		do
		{
			
	
		System.out.println("Enter two numbers : ");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		System.out.println();
		System.out.println("The sum of 2 numbers : "+(a+b));
		System.out.println();
		System.out.println("Do you wish to perform another operation : Yes or No ?");
		st = sc.next().charAt(0);
		
		}
		while(st =='Y' || st=='y');
		

	}

}
