package oopscncpt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args)throws FileNotFoundException {
		
		FileInputStream f=new FileInputStream("D:\\songs.mp3");
		 
		
		try
		{
			int a =20,b=0,c;
			c=a/b;
			System.out.println(c);
		}
	
		catch(Exception e)
		{
			System.out.println("Arithmetic exception");
			System.out.println(e.getMessage());
		}
		
		
		try {
			String s = null;
			System.out.println(s.length());
			
		}
		catch(NullPointerException e )
		{
			System.out.println(e.getLocalizedMessage());
			System.out.println("Null pointer Exception");
		}
		
		
	}

}
