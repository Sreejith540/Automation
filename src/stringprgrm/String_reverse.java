package stringprgrm;

public class String_reverse {

	public static void main(String[] args) {
		
		
		String s="Testing Training center";
		String [] st = s.split(" ");
		int length = st.length;
		for(int i=length-1; i>=0; i--)
		{
			System.out.print(st[i]+(" "));
		}
		

	}

}
