package OperationsPack;
public class OperationsClass
{
    public void oddEven(int n)
    {
        if(n%2==0)
        {
            System.out.println(n+" is even");
        }
        else
        {
            System.out.println(n+" is odd");
        }
    }
    public void prime(int n)
    {
        int c=0;
        for(int i=2;i<=n/2;i++)
        {
           c++;
        }
        if(c==0)
        {
            System.out.println(n+" is prime");
        }
        else
        {
            System.out.println(n+" is not prime");
        }
    }
    public void armstrong(int n)
    {
        int sum=0;
        for(int i=n;i>0;i=i/10)
        {
           int d=i%10;
           sum=sum+(d*d*d);
        }
        if(sum==n)
        {
            System.out.println(n+" is armstrong");
        }
        else
        {
            System.out.println(n+" is not armstrong");
        }
    }
}
