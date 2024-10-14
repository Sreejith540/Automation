package array;

import java.util.Scanner;

public class For_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For each loop
		Scanner sc=new Scanner(System.in);
				int [] arr = new int [3];
				System.out.println("Enter numbers : ");
				for(int i=0;i<=2;i++ )
				{
					arr[i]=sc.nextInt();

				}
				System.out.println("The numbers are :");
				for(int f : arr)
				{
					System.out.println(f);
				}
	}

}
