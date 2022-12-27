import java.util.Scanner;
class Swap
{
	public static void main(String [] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int first=sc.nextInt();
		int second=sc.nextInt();
		int third=0;
		sc.close();
		System.out.println("\nSwapping using third variable\n");
		System.out.println("Before swapping: first= "+first+" second= "+second);
		third=first;
		first=second;
		second=third;
		System.out.println("After swapping: first= "+first+" second= "+second);
		System.out.println("\nSwapping without using third variable\n");
		System.out.println("Before swapping: first= "+first+" second= "+second);
		first=first+second;
		second=first-second;
		first=first-second;
		System.out.println("After swapping: first= "+first+" second= "+second);
	}
}