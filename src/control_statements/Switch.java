package control_statements;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=8;
		switch(a)
		{
		case 1 : System.out.println("Sunday");
		break;
		case 2 : System.out.println("Monday");
		break;
		case 3 : System.out.println("Tuesday");
		break;
		case 4 : System.out.println("Wednesday");
		break;
		case 5 : System.out.println("Thursday");
		break;
		case 6 : System.out.println("Friday");
		break;
		case 7 : System.out.println("Saturday");
		break;
		default : System.out.println("Invalid choice");
		}
		
		//problem
		
		int b=5, c=8;
		String d = "*";
		
		switch(d)
		{
		case "+" : System.out.println("Output is = " +(b+c));
		break;
		case "-" : System.out.println("Output is = " +(b-c));
		break;
		case "*" : System.out.println("Output is = " +(b*c));
		break;
		case "/" : System.out.println("Output is = " +(b/c));
		break;
		default : System.out.println("Invalid choice");
		}

	}

}
