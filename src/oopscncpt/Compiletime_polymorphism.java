package oopscncpt;

public class Compiletime_polymorphism {

	public static void main(String[] args) {
		Compiletime_polymorphism ob = new Compiletime_polymorphism();
		ob.add();
		ob.add(20, 74);
		ob.add(5, 74);
		ob.add(5, 40);
	}

	public void add()
	{
		int a=41,b=54,c;
		c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, double b)
	{
		double c= a+b;
		System.out.println(c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	
}
