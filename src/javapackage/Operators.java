package javapackage;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Arithmetic Operators");
		
		int a=45, b=20, c=a+b;
		System.out.println("a+b="+c);
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		
		System.out.println("Assignment Operators");
		
		int d=c;
		System.out.println(d+=a);
		System.out.println(a-=b);
		
		System.out.println("Relational Operators");
		int v=900,x=800;
		System.out.println(v>=x);
		System.out.println(x!=v);
		
		System.out.println("Logical Operators");
		
		String id="sree", password ="sr123";
		System.out.println(id=="sr" && password =="sr1");
		System.out.println(id=="sree" && password== "sr1");
		System.out.println(id=="sree" && password == "sr123");
		System.out.println(id=="sre" || password =="sr1");
		System.out.println(id=="sree" || password == "sr1");
		System.out.println(id=="sree" || password == "sr123");
		System.out.println(!(id=="sree"));
		
		System.out.println("Unary Operators");
		
		int v2 =5;
		System.out.println(v2++);
		System.out.println(++v2);
		System.out.println(v2--);
		System.out.println(--v2);
		
		
		System.out.println("Ternary Operators");
		
		String T= a>b ? "a is greater" : "b is greater";		
		System.out.println(T);
		
			
			
			
			
		
	}

}
