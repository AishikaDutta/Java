import java.util.Scanner;
class set
{
	public void calc()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,fi=0;
		System.out.println("Fibonacci series upto "+n+" terms: ");
		for(i=0;i<=n;i++)
		{
			fi=fi+i;
			System.out.print(fi);
		}
	}
}
class Fibo
{
	public static void main(String []args)
	{
		set s=new set();
		s.calc();
	}
}