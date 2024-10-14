package array;

import java.util.Scanner;

public class Arrayprgrm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//int array
		
		int [] array = new int[3];
		System.out.println("Enter numbers : ");
		for(int i=0; i<=2; i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Entered numbers are : ");
		for(int i=0;i<=2;i++)
		{
			System.out.println(array[i]);
		}
		
		
		//String array
		
		String [] a = new String [5];
		System.out.println("Enter String : ");
		for(int i=0; i<=4;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("Entered Strings are : ");
		for(int i=0; i<=4;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	}

}
