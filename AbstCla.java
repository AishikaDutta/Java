import java.util.Scanner;
abstract class Arithmetic
{
    abstract void add();
    abstract void subs();
    void multiply()
    {
      System.out.println("Enter 2 numbers to multiply");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(a+" * "+b+" = "+(a*b));
    }
    void divide()
    {
      System.out.println("Enter 2 numbers to divide");
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a>b)
      System.out.println(a+" / "+b+" = "+(a/b));
      else
      System.out.println(b+" / "+a+" = "+(b/a));

    }
}
class Calculator extends Arithmetic
{
    void add()
    {
        System.out.println("Enter 2 numbers to add");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    void subs()
    {
        System.out.println("Enter 2 numbers to substract");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b)
        System.out.println(a+" - "+b+" = "+(a-b));
        else
        System.out.println(b+" - "+a+" = "+(b-a));

    }
}
class AbstCla
{
    public static void main(String args[])
    {
        Calculator c=new Calculator();
        c.add();
        c.subs();
        c.multiply();
        c.divide();
    }
}