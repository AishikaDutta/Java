import java.util.Scanner;
class Sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of terms");
		int n=sc.nextInt();
		int sum=0,i=1;
		sc.close();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum of first "+n+" natural numbers= "+sum);
	}
}