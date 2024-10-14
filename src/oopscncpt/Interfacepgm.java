package oopscncpt;

interface car1
{
	public void acceleration();
	public void speedlimit();
	
}

class bmw implements car1
{

	@Override
	public void acceleration() {
		System.out.println("bmw acc");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("bmw speed");
		
	}
	
}

class benz implements car1
{

	@Override
	public void acceleration() {
		System.out.println("benz acc");
		
	}

	@Override
	public void speedlimit() {
		System.out.println("benz speed");
		
		
	}
	
}

public class Interfacepgm {

	public static void main(String[] args) {
		car1 ob = new benz();
		ob.acceleration();
		ob.speedlimit();
		ob = new bmw();
		ob.acceleration();
		ob.speedlimit();
	
		
		
		

	}

}
