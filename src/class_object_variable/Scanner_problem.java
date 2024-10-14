package class_object_variable;

import java.util.Scanner;

public class Scanner_problem {

	public static void main(String[] args) {
		
		
		System.out.println("Enter 2 numbers");
		Scanner sc =new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Select an operation : +, -, *, /");
		char c =sc.next().charAt(0);
		switch(c)
		{
		case '+' : System.out.println(a+b);
		break;
		case '-' : System.out.println(a-b);
		break;
		case '*' : System.out.println(a*b);
		break;
		case '/' : System.out.println(a/b);
		break;
		default: System.out.println("Invalid choice");
		}
		
	
	}

}
