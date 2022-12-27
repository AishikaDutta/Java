class Display
{
	int i,j,line;
	public void show(int n)
	{
         line=n;
         for(i=1;i<=line;i++)
         {
         	for(j=1;j<=i;j++)
         	{
         		System.out.print("*");
         	}
         	System.out.println("");
         }
	}

}
public class Pattern
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		Display d=new Display();
		d.show(n);
	}
}