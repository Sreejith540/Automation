package method_prgrm;

import java.util.Scanner;

public class prgr {

	public static void main(String[] args) {
		prgr ob = new prgr();
		Scanner sc =new Scanner(System.in);
		
		ob.rec();//rectangle
		
		ob.square(6);//square
		
	
		double s=ob.circle();//circle
		System.out.println("Area of circle = "+s);
		
		System.out.println("Enter base and height of the triangle :");//triangle
		double b=sc.nextInt();
		double h =sc.nextInt();
		double a =ob.tri(b, h);
		System.out.println("Area of triangle ="+a);
		
		
		
		
	}
	
	public void rec()
	{
		int l=10, b=5, a;
		a=l*b;
		System.out.println("Area of rectangle = "+a);
	}
	
	public void square(int a)
	{
		int area= a*a;
		System.out.println("Area of square = "+area);
	}
	
	public double circle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		double r=sc.nextInt();
		double a;
		a=r*r*3.14;
		return a;
	}
	
	public double tri(double b,double h)
	{
		
		double c= 0.5*b*h;
		return c;
	}

}
