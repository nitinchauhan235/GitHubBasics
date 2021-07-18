import java.util.Scanner;



public class PopyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		int c = b/a;
		System.out.println("Division of two number is : " + c);
		System.out.println("Multiplication of two number is : " + a*b);
		System.out.println("Addition of two numbers is : " + a+b);

	}

}
