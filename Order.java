import java.util.Scanner;
class Base
{
   String fname;
   Base(String fname)
   {
      System.out.println("Base class");
      this.fname=fname;
   }
}
class Intermediate_Base extends Base
{
    String mname;
    Intermediate_Base(String fname,String mname)
    {
      super(fname);
      System.out.println("Intermediate Base class");
      this.mname=mname;       
    }
}
class Derived extends Intermediate_Base
{
    String lname;
    Derived(String fname,String mname,String lname)
    {
       super(fname,mname);
       System.out.println("Derieved class");
       this.lname=lname;
    }
    void full()
    {
       String full=fname+" "+mname+" "+lname;
       System.out.println("Full name: "+full+"\n");
    }
}
public class Order
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter your first, middle and last name respectively");
    String f=sc.next();
    String m=sc.next();
    String l=sc.next();  
    Derived D=new Derived(f,m,l);
    D.full();
    sc.close();

   } 
}
