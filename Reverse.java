import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int d,i,rev=0;
		if(n>999 && n<10000)
		{

		for(i=n;i>0;i=i/10)
		{
			d=i%10;
			rev=(rev*10)+d;
		}
		System.out.println("Reverse of "+n+" = "+rev);
	}
	else
		System.out.println("Please enter a 4 digit number");
	}
}