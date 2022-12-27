interface Notebook
{
     final int N_price=10;
     void add_price();
}
class Stationary implements Notebook
{
    int P_price=15;
    public void add_price()
    {
      int bill=N_price+P_price;
      System.out.println("\nThe total bill is = "+bill+"\n");
    }
}
public class InterClass
{
    public static void main(String args[])
    {
       Stationary S=new Stationary();
       S.add_price();
    }
}
