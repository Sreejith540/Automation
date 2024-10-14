package array;

import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		
		// sum of integer array
		
		int [] a =new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int sum=0;
		for(int i =0; i<=4; i++)
		{
			a[i]=sc.nextInt();
			sum = sum +a[i];
		}
		
		System.out.println("Sum of the array is : " +sum  );
	}

}
