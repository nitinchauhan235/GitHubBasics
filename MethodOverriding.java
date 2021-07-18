class Bank
{
	public int interest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	public int interest()
	{
		return 10;
	}
}

class HDFC extends Bank
{
	public int interest()
	{
		return 15;
	}
}



public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new SBI();
//		SBI s1 = new SBI();
//		HDFC h1 = new HDFC();
		System.out.println(b1.interest());
//		System.out.println(s1.interest());
//		System.out.println(h1.interest());

	}

}
