package oopscncpt;

class Realmadrid
{
	public void footballmthd()
	{
		System.out.println("football");
	}
}

class Cristiano extends Realmadrid
{
	public void cr()
	{
		System.out.println("Cristiano Ronaldo");
	}
}
class Marcelo extends Cristiano
{
	public void m12()
	{
		System.out.println("Marcelo");
	}
}
public class Multilevel {

	public static void main(String[] args) {
		Marcelo m = new Marcelo();
		m.footballmthd();
		m.cr();
		m.m12();
		
		

	}

}
