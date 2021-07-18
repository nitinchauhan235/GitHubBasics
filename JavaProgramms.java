
public class JavaProgramms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fibbonacci();
//		primeNum(51);
//		prime100();
//		palindrome(1221);
//		factorial(6);
//		duplArray();
//		largestarray();
//		sumall();
//		secondLargest();
		thirdLargest();
	}
	
	//Write a java program to print fibonacci series without using recursion and using recursion.
	//1 1 2 3 5 8 13 21
	public static void fibbonacci()
	{
		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		for (int i=2;i<10;i++)
		{
			int c = a+b; // 3
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}
	
	//Write a java program to check prime number.
	public static void primeNum(int a)
	{
		int x = 0;
		for(int i=2; i<=a/2;i++) 
		{
			if(a%i==0)
			{
				x=1;
				break;
			}
			else
			{
				x=0;
			}
		}
		if(x==0)
		{
			System.out.println("number is prime - " + a);
		}
		else 
		{
			System.out.println("Not a prime number - " + a);
			}
	}
	
	////Write a java program print 1st 100 prime number.
	
	public static void prime100()
	{
		int x=0;
		for (int i=1;i<=100;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j == 0)
				{
					x=1;
					break;
				}
				else
				{
					x=0;
				}
			}
			if(x==0)
			{
				System.out.println(i);
			}
		}
	}
	
	//Write a java program to check palindrome number.
	public static void palindrome(int pal)
	{
		String rev ="";
		for(int i=Integer.toString(pal).length()-1;i>=0;i--)
		{
			rev = rev + Integer.toString(pal).charAt(i);
		}
		
		if (Integer.toString(pal).equalsIgnoreCase(rev))
			
		{
			System.out.println("Number is palindrome -" +pal);
		}	
		
	}
	
	//Write a java program to print factorial of a number.
	
	public static void factorial(int a)
	{
		int fact=1;
		for (int i=a; i>=1;i--)
		{
			fact = fact * i;
			
		}
		System.out.println(fact);
	}

	//Program to print the duplicate elements of an array
	
	public static void duplArray()
	{
	
		int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3,};
		int freq[] = new int[arr.length];
		int visited =1;
		
		for(int i=0;i<arr.length;i++)
		{
			int count = 1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count ++;
					// to avoid counting the same element
					freq[j] = visited;
					System.out.println(arr[j]);
				}
			}
			if(freq[i] !=visited)
			{
				freq[i]=count;
			}
		}
		
		for (int i=0;i<=freq.length-1;i++)
		{
			if(freq[i]!=visited)
			{
				System.out.println(arr[i] + " " + freq[i]);
			}
		}
		
		
	}
	
	//Program to print the largest element in an array
	public static void largestarray()
	{
		int arr[] = {5,2,9,400,71,11};
		int largest = arr[0];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] > largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
		
				
	}
	
	//Java Program to print the sum of all the items of the array
	
	public static void sumall()
	{
		int arr[] = {1,2,3,4,6};
		int sum=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
	
	//Java Program to find second Largest Number in an Array
	public static void secondLargest()
	{
		int arr[] = {1,2,3,4,51,61,7,};
		int largest = arr[0];
		int slargest = arr[1];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] > largest && arr[i] > slargest)
			{
				
				
				slargest = largest;
				largest = arr[i];
				
			}
		}
		System.out.println(largest);
		System.out.println(slargest);
		
	}
	
	//Java Program to find third Largest Number in an Array also it will sort in ascending order
	public static void thirdLargest()
	{
		int arr[] = {1,2,5,6,3,2};
		int temp=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i] > arr[j]) 
				{
					temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
			
		}
		System.out.println(arr[arr.length - 3]);
	
		
	}
	
	
}
