import java.util.Scanner;
class Digit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 4 diigt number");
		int a=sc.nextInt();
		int i,d,sum=0;
		sc.close();
		for(i=a;i>0;i=i/10)
		{
             sum=sum+(i%10);
		}
		System.out.println("Sum of digits of "+a+" = "+sum);
	}
}