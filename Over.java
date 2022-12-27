import java.util.Scanner;
class Load
{
    void urName(String first)
    {
          System.out.println("First name only:  "+first);
    }
    void urName(String first,String middle)
    {
          System.out.println("With Middle Name: "+first+" "+middle);
    }
    void urName(String first,String middle,String last)
    {
          System.out.println("Full Name:        "+first+" "+middle+" "+last);
    }
}
public class Over 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Load L=new Load();
        System.out.println("Enter first name");
        String s1=sc.next();
        System.out.println("Enter middle name");
        String s2=sc.next();
        System.out.println("Enter last name");
        String s3=sc.next();
        L.urName(s1);
        L.urName(s1,s2);
        L.urName(s1,s2,s3);
        sc.close();
    }
}
