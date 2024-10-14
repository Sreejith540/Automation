package array;

import java.util.Scanner;

public class Largest_element {

	public static void main(String[] args) {
		
		int []a=new int[3];
		System.out.println("Enter numbers :");
		Scanner sc = new Scanner(System.in);
		int max =a[0];
		for (int i=0; i<3;i++)
		{
			a[i]= sc.nextInt();
		
		}
		for (int i=0; i<3;i++)
		{
			if(a[i] > max)
			{
				max=a[i];
			}
			
		}
		System.out.println("The largest element of the array is : " +max);
		

	}

}
