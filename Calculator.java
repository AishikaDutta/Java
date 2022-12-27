import java.util.Scanner;
import ArithmeticPack.Arithmetic;
public class Calculator
{
   public static void main(String args[])
   {
     Arithmetic A=new Arithmetic();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    A.calc(a,b);

   } 
}
