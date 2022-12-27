import java.util.Scanner;
class Great
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("\nFinding greatest no using if-else\n");
		if(a>b && a>c)
			System.out.println(a+" is the greatest number");
		else if(b>a && b>c)
			System.out.println(b+" is the greatest number");
		else
			System.out.println(c+" is the greatest number");
		System.out.println("\nFinding greatest no using nested if-else\n");
		if(a>b)
		{
			if(a>c)
				System.out.println(a+" is the greatest number");
			else
				System.out.println(c+" is the greatest number");
		}
		if(b>a)
		{
			if(b>c)
				System.out.println(b+" is the greatest number");
			else
				System.out.println(c+" is the greatest number");
		}
		else
			System.out.println(c+" is the greatest number");


	}
}