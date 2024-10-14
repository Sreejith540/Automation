package control_statements;

public class Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age =24, weight=60;
		
		if (age>=18)
		{
			if (weight >=50)
			{
				System.out.println("Eligible to donate blood");
			}
			else 
			{
				System.out.println("Insufficient weight");
			}
		}
			else
			{
				System.out.println("Not eligible to donate blood");
			}
		
		
	}

}
