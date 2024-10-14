package javapackage;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		char st;
		do
		{
			
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		
			
			int i = sc.nextInt();
		int s=i;
		int j,reverse=0;
		while (i>0)
		{
			j=i%10;
			reverse= reverse*10+j;
			i=i/10;
		}
	
		if(s==reverse)
		{
			System.out.println("The number is a palindrome number");
		}
		else
		{
			System.out.println("The number is not a palindrome number");
		}
		System.out.println("Do you want to continue : Y or N");
		st = sc.next().charAt(0);
		
			}
			while(st =='Y');
		
	}

}
