class Animal
{
	public void eat()
	{
		System.out.println("eating ..");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("barking .. ");
	}
}

class BabyDog extends Dog
{
	public void sleep()
	{
		System.out.println("sleeping..");
	}
}

class a
{
	public a()
	{
		System.out.println("prinring a");
	}
}

class b extends a
{
	public b()
	{
		System.out.println("printing b");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BabyDog d1 = new BabyDog();
//		d1.eat();
//		d1.bark();
//		d1.sleep();
		
		b b1 = new b(); // it will call constructor of b which again will call constrcutor of a
		

	}

}
