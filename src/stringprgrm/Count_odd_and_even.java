package stringprgrm;

import java.util.Scanner;

public class Count_odd_and_even {

	public static void main(String[] args) {
		System.out.println("Enter numbers : ");
		int [] a =new int[5];
		Scanner sc= new Scanner(System.in);
		int Even=0;
		int Odd =0;
		for(int i=0;i<=4;i++)
		{
		a[i] = sc.nextInt();
		
		if (a[i]%2==0) {
			Even = Even+1;	
		}
		else
		{
			Odd=Odd+1;
		}
		}
		System.out.println("Count of Even numbers : " +Even);
		System.out.println("Count of Odd numbers : "+Odd);
	}

}
