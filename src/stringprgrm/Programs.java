package stringprgrm;

public class Programs {

	public static void main(String[] args) {
		
		String s1 ="Hello";
		String s2 = "  world  ";
		String s3 = "Hello world earth india";
		String s4 = "hello world";
		
		//concat
		System.out.println(s1.concat(s2)); 
		System.out.println(s1+s2);
		System.out.println(5+3+s1+5+47+s2);
		
		//equals and equalsIgnoreCase
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		//contains
		System.out.println(s3.contains("earth"));
		
		//length
		System.out.println(s1.length());
		
		//trim
		System.out.println(s2.trim()); //trims white spaces in the end and beginning
		
		//charAt
		System.out.println(s1.charAt(1));
		
		//toUppercase and toLowercase
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//startswith and endswith
		System.out.println(s3.startsWith("Hello"));
		System.out.println(s3.endsWith("india"));
		
		//substring
		System.out.println(s3.substring(2,8));
		
		//replace
		System.out.println(s4.replace("hello","hi"));
		
		//split
		//we create an array to store the splitted words
		String[] st = s3.split(" "); //words after white space are splitted
		for(String s : st)
		{
			System.out.println(s);
		}
		
		//toCharArray
		char[] c = s1.toCharArray();
		for(char c1 :c)
		{
			System.out.println(c1);
		}
		
	
		
		
		
		
		

	}

}
