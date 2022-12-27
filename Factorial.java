import java.util.Scanner;
class Factorial
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		sc.close();
		int i,f=1;
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("\nFactorial of "+n+" = "+f);
	}
}