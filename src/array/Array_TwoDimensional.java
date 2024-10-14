package array;

import java.util.Scanner;

public class Array_TwoDimensional {

	public static void main(String[] args) {
		
		// 2D integer array
		
		int [][] a= new int[3][2];
		System.out.println("Enter numbers : ");
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
	    }  
		for(int i=0; i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		//2D String array
		
		String [][] ar =new String[5][3];
		System.out.println("Enter the String : ");
		for(int i=0; i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				ar[i][j]=sc.next();
			}
			
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
