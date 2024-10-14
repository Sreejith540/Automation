package oopscncpt;

public class Runtime_polymorphism {

	public static void main(String[] args) {
		son ob =new son();
		ob.age();
		ob.education();

	}

}
class Father
{
	public void education()
	{
	System.out.println("Education : bsc");
	}
	
	public void age()
	{
		System.out.println("Age : 58");
	}
}
class son extends Father
{

	@Override
	public void education() {
		System.out.println("Education : Phd");
		super.education();
	}

	@Override
	public void age() {
		System.out.println("Age : 26");
		super.age();
	}
	
}
