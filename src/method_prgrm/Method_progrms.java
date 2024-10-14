package method_prgrm;

public class Method_progrms {

	public static void main(String[] args) {
		Method_progrms ob= new Method_progrms(); //calling object
		ob.add(); //add method
		int s = ob.sub();//sub method
		System.out.println("sub = "+s);
		ob.mul(50,20);//mul method
		double d=ob.div(50,25);//div
		System.out.println("div = "+d);
		
		
	}
	
	//Method without returntype and without parameter
	public void add()
	{
		int a=50,b=20,c;
		c=a+b;
		System.out.println("add = " +c);
		
	}
	
	//Method with returntype and without parameter
	public int sub()
	{
		int a=50,b=20,c;
		c=a-b;
		return c;
	}
	
	//Method without returntype and with parameter
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("mul = " +c);
	}
	
	//Method with returntype and with parameter
	public double div(double a,double b)
	{
		double c=a/b;
		return c;
	}
}
