class Outer
{
void Calcu()
{
    System.out.println("\nMethod overloading using nested class");
    class Compute
    {
      // int a=2,b=3,c=4;
        void compute(int a)
       {
           System.out.println("Square of "+a+" = "+(a*a));
       }
       void compute(int a,int b)
       {
           System.out.println(b+" the power of "+a+" = "+Math.pow(a,b));
       }
      void compute(int a,int b,int c)
       {
           System.out.println(c+" and "+b+" to the power of "+a+" = "+Math.pow(Math.pow(a,b),c));
       }
    }
     Compute c1=new Compute();
     c1.compute(2);
     c1.compute(2,3);
     c1.compute(2,3,4);
     
}
}
public class Main {
    public static void main(String args[])
    {
        Outer out=new Outer();
        out.Calcu();
    }
}

