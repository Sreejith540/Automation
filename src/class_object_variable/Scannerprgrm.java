package class_object_variable;

import java.util.Scanner;

public class Scannerprgrm {

	public static void main(String[] args) {
		
		System.out.println("Enter 2 numbers");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= a*b;
		System.out.println("Multiplication of 2 numbers="+c);
		
		System.out.println("Enter a string");
		String S=sc.next();
		System.out.println(S);
		
		System.out.println("Enter a character");
		char c1=sc.next().charAt(0);
		System.out.println(c1);

	}

}
