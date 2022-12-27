class Outer
{
  void even(int a[])
  {
     int sum=0;
     for(int i=0;i<a.length;i++)
     {
         if(a[i]%2==0)
         {
             sum=sum+a[i];
         }
     }
     System.out.println("Sum of even numbers in the array= "+sum);
  }
  class Nested
  {
      void odd(int a[])
      {
          int sum1=0;
          for(int j=0;j<a.length;j++)
          {
              if(a[j]%2!=0)
              {
                  sum1=sum1+a[j];
              }
          }
          System.out.println("Sum of odd numbers in the array= "+sum1);
      }
  }
}
public class NestedCl
{
 public static void main(String args[])
 {
     Outer out=new Outer();
     Outer.Nested nest=out.new Nested();
     int ar[]={12,23,34,45,56,67};
     out.even(ar);
     nest.odd(ar);
 }   
}
