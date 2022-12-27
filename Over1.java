class AA
{
    int x=10,y=12;
    void msg1()
    {
        System.out.println( "Value of x= "+x+" Value of y= "+y);
    }
    void msg2()
    {
        System.out.println("Value of x= "+x+" Value of y= "+y);
    }
}
class BB extends AA
{
  int y=20,z=30;
  void msg2()
  {
    System.out.println("Value of z= "+z+" Value of y= "+y);
  }
  void msg3()
  {
    System.out.println("Sum of z and y="+(z+y));
  }
}
public class Over1
{
  public static void main(String args[])
  {
      BB B=new BB();
      B.msg1();
      B.msg2();
      B.msg3();
  }  
}
