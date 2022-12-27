import java.util.Scanner;
class Constructor1 
{
  Constructor1()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter a number :");
    int n=sc.nextInt();  
    System.out.println("Square of "+n+" = "+(n*n));
  } 
  Constructor1(Constructor1 Con)
  {
    System.out.println("Cube of "+Con.n+" = "+(Con.n*Con.n*Con.n));
  }
  public static void main(String args[])
  {
      Constructor1 C1=new Constructor1();
      Constructor1 C2=new Constructor1(C1);
  }
}
