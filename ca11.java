import java.util.Scanner;
public class ca11 
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter value to coefficients a where a cannot be 0");
         int a=sc.nextInt();
         System.out.println("Enter value to coefficients b");
         int b=sc.nextInt();
         System.out.println("Enter value to coefficients c");
         int c=sc.nextInt();
         sc.close();
         double D,r1,r2,r;
         D=(b*b)-(4*a*c);
         if(D>0)
         {
             r1=(-b+Math.sqrt(D))/(2.0*a);
             r2=(-b-Math.sqrt(D))/(2.0*a);
             System.out.println("Roots are real and distinct");
             System.out.print("Roots are = "+r1+","+r2);
         }
         else if(D==0)
         {
             r=-b/(2.0*a);
             System.out.println("Roots are real and equal");
             System.out.print("Root is = "+r);
         }
         else 
         {
             System.out.print("Roots are imaginary");
         }
    }
}
