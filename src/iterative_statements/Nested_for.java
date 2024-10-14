package iterative_statements;

public class Nested_for {

	public static void main(String[] args) {
		
		//Nested for
		
		for(int i=1; i<=3;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//Problem
		
		System.out.println();
		
		for(int s=1; s<=4;s++)
		{
			for(int d=1; d<=s;d++)
			{	
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
