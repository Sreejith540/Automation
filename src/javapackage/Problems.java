package javapackage;

public class Problems {

	public static void main(String[] args) {
		
		int a=23, b=45;
		System.out.println("value of a=" + a + ", value of b=" + b);
		System.out.println("a = b is " +(a==b));
		
		System.out.println("");
		
		int a1=55, b1=70;
		System.out.println("value of a =" + a1 + ", value of b =" + b1);
		System.out.println("a < 50 and a < b is " + (a1<50 && a<b1));

		System.out.println("");
		
		int a3=17;// print 2nd digit
		System.out.println(a3%10);
	}

}
