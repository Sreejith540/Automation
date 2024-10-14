package oopscncpt;

interface Tvremote
{
	public void volume();
	public void channel(); 
}

interface smarttvremote extends Tvremote
{
	public void youtube();
	
}

class Tv implements smarttvremote
{

	@Override
	public void volume() {
		System.out.println("volume");
		
	}

	@Override
	public void channel() {
		System.out.println("channel");
		
	}

	@Override
	public void youtube() {
		System.out.println("youtube");
		
	}
	
}
public class Abstctn_prblm {

	public static void main(String[] args) {
	
		Tv sc =new Tv();
		sc.youtube();
		sc.channel();
		sc.volume();
		

	}

}
