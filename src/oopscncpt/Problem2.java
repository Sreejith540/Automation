package oopscncpt;

import java.util.Scanner;

public class Problem2 {	
	
	//sum of digits in integer
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int s= sc.nextInt();
		Problem2 ob=new Problem2();
		ob.add(s);
		
	
	}
	
	public int add(int s)
	{
		int sum=0,r;
		while(s>0)
		{
			r=s%10;
			sum=sum+r;
			s=s/10;
		}
		System.out.println("sum of integer ="+sum);
	   return sum;
	}
}
