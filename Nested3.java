class Anony
{
    void compute(int a)
    {
        System.out.println("Square of "+a+" = "+(a*a));
    }
}
public class Nested3
{
   public static void main(String args[])
   {
       Anony A=new Anony()
       {
           void compute(int b)
           {
               System.out.println("Cube of "+b+" = "+(b*b*b));
           }
       };
       A.compute(2);
   } 
}
