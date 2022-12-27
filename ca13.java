public class ca13 
{
  public static void main(String args[])
  {
      System.out.println("Break as a civilized form of goto");
      int c=0;
      first:for(int i=0;i<=3;i++)
      {
          for(int j=0;j<=100;j++)
          {
              c=c+2;
              if(c>18)
              {
                  break first;
              }
              System.out.print(c+" ");
          }
          System.out.println("\nNow we are in outer loop");
      }
      System.out.println("\nWe are out of deeply nested loop");
  }  
}
