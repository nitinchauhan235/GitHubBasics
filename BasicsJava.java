public class BasicsJava {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		/*
		 * int c = a+b; System.out.println(c);
		 */
		evenodd(31);
		leapYear(2020);
		switche(20);
		swithcstr("Intermediate1");
		enggSub("Mech", 2);
        System.out.println("changes done by user B");
        System.out.println("change by user a");
        System.out.println("Again A changed");
        System.out.println("Architect A changed the code");
	}
	
	public static void evenodd(int a)
	{
		if (a%2 == 0)
		{
			System.out.println("Even number - " + a);
		}
		else
		{
			System.out.println("Odd Number " + a);
		}
		
	}
	// A year is leap, if it is divisible by 4 and 400. But, not by 100.
	public static void leapYear(int year)
	{
		if ((year % 4 == 0) )
		{
			if (year % 100 != 0)
			{
				System.out.println("leap year - " + year);
			}
		}
		else
		{
			System.out.println("not a leap year - " + year);
		}
	}
	
	public static void switche(int num)
	{
		switch(num)
		{
		case 10:
			System.out.println("number is 10");
			
		case 20:
			System.out.println("number is 20");
			
		case 30:
			System.out.println("number is 30");
			
		default:
			System.out.println("number is not in 10, 20, 30");
		}
	}
	
	public static void swithcstr(String s)
	{
		int level = 0;
		switch(s)
		{
			case "Begineer":
				level = 1;
				break;
			case "Intermediate":
				level = 2;
				break;
			default:
				System.out.println("Not on required level");
				break;
		}
		System.out.println(level);
	}
	
	public static void enggSub(String branch, int year)
	{
	switch(year)
	{
		case 1:
			System.out.println("Subject for 1st year are common - maths, science and sst");
			break;
		case 2:
			switch(branch)
			{
			case "CS":
				System.out.println("Subject for 2nd year CS branch are - DS2, CS2");
				break;
			case "Mech":
				System.out.println("Subject for 2nd year Mech branch are - Thermo2, Maths2");
				break;
			default:
				System.out.println("not a valid 2nd year branch");
			}
			break;
		default:
			System.out.println("not a valid enginnering year");
	}
		
	}

}
