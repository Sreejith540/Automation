package oopscncpt;

interface basicanimal
{
	public void eat();
	public void sleep();
}

class monkey
{
	public void jump()
	{
		System.out.println("jump");
	}
	public void bite()
	{
		System.out.println("bite");
	}
	
}
class human extends monkey implements basicanimal
{
	public void speak()
	{
		System.out.println("speak");
	}
	
	@Override
	public void eat() {
		System.out.println("eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep");
		
	}
	
}

public class Interface_prblm {

	public static void main(String[] args) {
		human ob =new human();
		ob.bite();
		ob.eat();
		ob.jump();
		ob.sleep();
		ob.speak();
		

	}

}
