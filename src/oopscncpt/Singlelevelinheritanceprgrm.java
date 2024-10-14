package oopscncpt;

class Parent
{	
	int i;
	public void parentmthd()
	{
		System.out.println("Parent");

	}	
}

class Child extends Parent
{
	
	int c;
	public void childmthd()
	{
		System.out.println("Child");
	}
	
}
public class Singlelevelinheritanceprgrm {

	
	public static void main(String[] args) {
		Child ob =new Child();
		ob.childmthd();
		ob.parentmthd();

	}

}
