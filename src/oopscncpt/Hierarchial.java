package oopscncpt;

class Football
{
	public void footballmthd()
	{
		System.out.println("football");
	}
}

class Brazil extends Football
{
	public void brazil()
	{
		System.out.println("Brazil");
	}
}
class Spain extends Football
{
	public void spain()
	{
		System.out.println("Marcelo");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		
		Brazil b=new Brazil();
		b.brazil();
		b.footballmthd();
		
		Spain s=new Spain();
		s.spain();
		s.footballmthd();
		
	}

}
