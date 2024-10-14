package javapackage;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		System.out.println("Enter the row count : ");
		Scanner sc=new Scanner(System.in);
		int r = sc.nextInt();
		
		for (int i=1;i<=r;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
