package oopscncpt;

abstract class Car
{
	abstract public void acceleration();
	public void colour()
	{
		System.out.println("black");
	}
}

class kia extends Car
{

	@Override
	public void acceleration() {
		System.out.println("kia acceleration");
		
	}
	
}

class maruti extends Car
{

	@Override
	public void acceleration() {
		System.out.println("maruti acceleration");
		
	}
	
}


public class Abstraction {

	public static void main(String[] args) {
		kia ob=new kia();
		ob.acceleration();
		ob.colour();
		maruti sc=new maruti();
		sc.acceleration();
		sc.colour();
	}

}
