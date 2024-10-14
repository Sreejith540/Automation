package oopscncpt;

class Member 
{
	String Name;
	int Age;
	long Phoneno;
	String Address;
	int Salary;
	
	public void printdetails()
	{
		System.out.println("Member Details " );
		System.out.println("Name :"+ Name);
		System.out.println("Age :"+ Age);
		System.out.println("PhoneNo :"+ Phoneno);
		System.out.println("Address :"+ Address);
		System.out.println("Salary :"+ Salary);
	}
}

class Employee extends Member
{
	String Specialization;
}

class Manager extends Member
{
	String Department;
}
public class Inheritance_pgm {

	public static void main(String[] args) {
		Manager ob = new Manager();
		ob.Name="Sreejith";
		ob.Age=25;
		ob.Phoneno=874596;
		ob.Address="hghgjhg";
		ob.Salary=20000;
		ob.printdetails();
		System.out.println(ob.Department="Tester");
		System.out.println();
		
		Employee m= new Employee();
		m.Name="kittu";
		m.Age=25;
		m.Phoneno=8745965455l;
		m.Address="hghgjhg";
		m.Salary=20000;
		m.printdetails();
		System.out.println(m.Specialization ="Tester");
	
		

	}

}
