import java.util.Scanner;
class Extr
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your full name");
       String name=sc.nextLine();
       sc.close();
       name.trim();
       int first=name.indexOf(" ");
       int last=name.lastIndexOf(" ");
       String mid=name.substring(first,last);
       StringBuffer rev=new StringBuffer(mid);
       System.out.println("Middle Name : "+mid.trim());
       System.out.println("Reversed    : "+rev.reverse());
   } 
}

