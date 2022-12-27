class Outer
{
    private int x=20;
    class In
    {
        private int y=10;
        void product(int n)
        {
            System.out.println("Product of "+x+" and "+n+" = "+(x*n));
        }
    }
    void suma()
    { 
        int sum=x+y;
        System.out.println("Sum= "+sum);
   }
}
public class NestedCl1
{
    public static void main(String args[])
    {
        Outer out=new Outer();
        Outer.In in=out.new In();
        in.product(10);
        out.suma();

    }
}


