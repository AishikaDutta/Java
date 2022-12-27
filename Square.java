import java.util.Scanner;
class Sqaure
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		int i=1,sum=0;
		sc.close();
		do
		{
			sum=sum+(i*i);
			i++;
		}
		while(i<=n);
		System.out.println("Sum of first "+n+" natural numbers= "+sum);
	}
}