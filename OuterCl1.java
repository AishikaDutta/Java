class Outer
{
    void add(int q)
    {
        int addprime=0;
        class Nested
        {
          int t=0,fig=0;
          int determine()
          {
             for(int i=2;i<=q/2;i++)
              {
               if(q%i==0)
               {
                   t++;
               }
              }
             if(t==0)
             {
             fig=1;
             }
             else
             {
               fig=0;
             }
             return fig;

           }
        }
        Nested F=new Nested();
        int a=F.determine();
        if(a==1)
        {
            for(int j=q;j>0;j=j/10)
            {
                addprime=addprime+(j%10);
            }
            System.out.println("Sum of digits= "+addprime);
        }
        else
        {
            System.out.println(q+" not a prime number");
        }
    }
}
public class OuterCl1 
{
  public static void main(String args[])
  {
      Outer out=new Outer();
      out.add(97);
  }  
}