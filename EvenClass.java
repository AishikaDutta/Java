package Numeric;
public class EvenClass
{
    public void checkEven(int []a)
   {
       for(int i=0;i<a.length;i++)
       {
           if(a[i]%2==0)
           {
               System.out.println(a[i]+" is even");
           }
       }
   } 
}