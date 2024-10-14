package javapackage;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Problem --- swap--- with a variable");
		
		int a1=20, b1=10;// swap a1 to b1 and b1 to a1
		System.out.println("Before swapping value of a1 =" + a1 +", value of b1 =" + b1);
		int c1 = a1;
		a1=b1;
		b1=c1;
		System.out.println("After swapping value of a1 =" + a1 +", value of b1 =" + b1);
		
		System.out.println("Problem --- swap--- without a variable");
		
		int a2=20, b2=10;
		 System.out.println("Before swapping: a2 = " + a2 + ", b2 = " + b2);
		a2 = a2 + b2; // a now becomes 30 (20 + 10)
        b2 = a2 - b2; // b now becomes 20 (30 - 10)
        a2 = a2 - b2; // a now becomes 10 (30 - 20)
        System.out.println("After swapping: a2 = " + a2 + ", b2 = " + b2);


	}

}
