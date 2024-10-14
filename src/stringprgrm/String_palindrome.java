package stringprgrm;

import java.util.Scanner;

public class String_palindrome {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.next();
		String rev = "";
		int len=s.length();
		for(int i=len-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse of the entered string : " +rev);
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not a palindrome");
		}

	}

}
