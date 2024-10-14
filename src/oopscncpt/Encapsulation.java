package oopscncpt;

class Student
{
	private String studname;
	private int studid;
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public int getStudid() {
		return studid;
	}
	public void setStudid(int studid) {
		this.studid = studid;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setStudid(12);
		s.setStudname("Sree");
		System.out.println(s.getStudid());
		System.out.println(s.getStudname());
		
	}

}
