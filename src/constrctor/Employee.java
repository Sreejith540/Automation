package constrctor;

public class Employee {
	
	int empid;
	String empname;
	
	public Employee (int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
	}
	
	public void display()
	{
		System.out.println("Empid : "+empid);
		System.out.println("Empname : "+empname);
	}

	public static void main(String[] args) {
		Employee e = new Employee(7, "Sreejith");
		e.display();
		

	}

}
