import java.util.Scanner;

public class Addition{
	public static void main(String args[]){
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = ab.nextInt();
		int b = ab.nextInt();
		int s = a+b;
		
		System.out.println("Sum of "+a+" and "+b+" is "+s);
	}
}	