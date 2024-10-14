package stringprgrm;

import java.util.Scanner;

public class String_vowels {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s= sc.nextLine();
		s=s.toLowerCase();
		int l=s.length();
		int count=0;
		for(int i=0; i<=l-1;i++)
			
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u') {
				count ++;
			}
		}
		System.out.println("Vowel count = " +count);

	}

}
