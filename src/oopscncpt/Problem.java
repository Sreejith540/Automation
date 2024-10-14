package oopscncpt;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		//count all words in a string
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string :");
	String s = sc.nextLine();
	String [] st = s.split(" ");
	int count = st.length;
	System.out.println("Count of words in string : "+count);
	

	}

}
