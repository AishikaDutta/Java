import java.util.Scanner;
class Co 
{
  int num1,img1;
  Co()
  {
    num1=2;
    img1=6;  
  } 
  Co(int num1,int img1)
  {
      this.num1=num1;
      this.img1=img1;
  }
  Co Summation(Co c1,Co c2)
   {
       Co c3=new Co();
       c3.num1=c1.num1+c2.num1;
       c3.img1=c1.img1+c2.img1;
       return c3;
   }
}
class Con1
{
    public static void main(String args[])
    {
        Co a=new Co();
        Co b=new Co(4,8);
        Co c=new Co();
        c=c.Summation(a,b);
        System.out.println("\nSum: "+c.num1+"+"+c.img1+"i");

    }
}
