package iterative_statements;

public class While_program {

	public static void main(String[] args) {
		
		int i=514258; 
		int j;
		int rev =0;
		while(i>0)
		{
			j=i%10;
			rev=rev*10+j;
			i=i/10;
		}
		System.out.println("Reverse of the number = "+rev);
	}

}
