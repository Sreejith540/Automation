package iterative_statements;

public class While_loop {

	public static void main(String[] args) {
		
		//While loop
		
		int i=1;
		while (i<=10)
		{
			System.out.println(i);
		i++;
		}
		
		System.out.println();
		
		//problem
		
		int j=4647;
		int d=0;
		while(j>0)
		{
			j=j/10;
			d++;
			
		}
		System.out.println("Number of Digit = "+d);
	}
	

	

}
