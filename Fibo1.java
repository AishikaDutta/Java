import java.util.Scanner;
class Calc
{
    static int a=0,b=1,c,n;
    static void input()
    {
      System.out.println("\nEnter number of terms :");
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      sc.close();
    }
    static void display()
    {
       System.out.println("Fibonnaci series upto "+n+" terms ");
       System.out.print("\n"+a+" "+b);
       for(int i=2;i<=n;i++)
       {
           c=a+b;
           System.out.print(" "+c);
           a=b;
           b=c;
       }
    }
}
public class Fibo1
 {
    public static void main(String args[])
    {
        Calc.input();
        Calc.display();
    }
}
