package stringprgrm;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
	
		System.out.println("Enter a String : ");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		String rev ="";
		int l =s.length(); // l= length
		for(int i=l-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		
	System.out.println("Reversed String : "+rev);

	}

}
