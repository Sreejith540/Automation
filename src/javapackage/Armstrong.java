package javapackage;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		int i= sc.nextInt();
		int temp=i;
		int j,cube,sum=0;
		
		while(i>0)
		{
			j=i%10;
			cube= j*j*j;
			sum= sum+cube;
			i=i/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}

	}

}
