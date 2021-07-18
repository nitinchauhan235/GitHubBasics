class Person
{
	String name;
	int id;
	
	public Person(int id,String name)
	{
		this.name=name;
		this.id=id;
	}
}

class Emp extends Person
{
	int salary;
	public Emp(int id, String name,int salary)
	{	
		super(id,name);
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println(id + name + salary);
	}
}


public class SuperUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e1 = new Emp(1,"Nitin",100000);
		e1.display();

	}

}
