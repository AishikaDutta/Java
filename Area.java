import java.util.Scanner;
class Area
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length and breadth of a rectangle");
		float l=sc.nextFloat();
		float b=sc.nextFloat();
		float area,peri;
		sc.close();
		area=l*b;
		peri=2*(l+b);
		System.out.println("\nPerimeter of rectangle= "+peri);
		System.out.println("\nArea of rectangle= "+area);
	}
}