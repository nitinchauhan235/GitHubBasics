
public class ObjectandClasses {
	
	int roll;
	int marks;
	static int age=10;
	
	public void change()
	{
		age=20;
	}
	
	
	public ObjectandClasses(int r, int m)
	{
		roll=r;
		marks=m;
	}
	
	public void print()
	{
		System.out.println(roll +" " + marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectandClasses o1 = new ObjectandClasses(1, 100);
		ObjectandClasses o2 = new ObjectandClasses(2, 200);
		/*o1.roll = 1;
		o1.marks = 100;
		o2.roll =2;
		o2.marks =200;
		System.out.println(o1.roll + " " + o1.marks) ;
		System.out.println(o2.roll + " " + o2.marks) ;*/
		
		o1.print();
		o2.print();
	
	}

}
