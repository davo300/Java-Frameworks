import java.util.Scanner;
public class SimpleAddition 
{
	public static void main(String[] args) 
	{
		// prompt the user to enter 2 intergers 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int v1 = input.nextInt();
		System.out.print("Enter an integer: ");
		int v2 = input.nextInt();
		input.close();
		// add the numbers 
		int total = v1 + v2; 
		
		// print the result 
		System.out.println("The sum of the intergers is " + total);
	}
}
