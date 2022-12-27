import java.util.Scanner;
class Display
{
	private int line;
	public void set(int line )
	{
		this.line=line;
	}
	int i,j;
	public void show()
	{
		for(i=1;i<=line;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.println("0");
				else
					System.out.println("1");
			}
			System.out.println("");
		}
	}
}
class Pattern1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of lines-");
		int num=sc.nextInt();
		Display d=new Display();
		d.set(num);
		d.show();
		sc.close();

	}
}