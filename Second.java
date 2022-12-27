import java.util.Scanner;
class Second
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		if(num>10)
			System.out.println("\n"+num+" is greater than 10\n");
		else if(num<10)
			System.out.println("\n"+num+" is less than 10\n");
		else
			System.out.println("\n"+num+" is equal to 10\n");
	}
}