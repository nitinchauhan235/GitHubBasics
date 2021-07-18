
public class LoopsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//forloop();
		//rightangle();
		//invertedrighttraiangle();
		foreach();

	}
	
	public static void forloop()
	{
		for (int i=1; i<=10; i++)
				{
					System.out.println(i);
				}
	}
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
	
	public static void rightangle()
	{
		for (int i=1;i<=5;i++)
		{
			for (int j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
//	* * * * * * 
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	*  
	
	public static void invertedrighttraiangle()
	{
		for (int i=1;i<=6;i++)
		{
			for (int j=6;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 * //The for-each loop is used to traverse array or collection in java. //It is
	 * easier to use than simple for loop because we don't need to increment value
	 * and use subscript notation.It works on elements basis not index. It
	 * returns element one by one in the defined variable.
	 */
	
	public static void foreach()
	{
		int arr[]= {1,2,3,4,5,6};
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i:arr)
		{
			System.out.println(i);
		}
	}
	
	
	
	
	
	
}
