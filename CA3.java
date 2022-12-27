import java.util.Scanner;
class RatingOutOfRangeError extends Exception
{
  public RatingOutOfRangeError(String str)
  {
      super(str);
  }
}
class CA3
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int ch,r;
       for(int i=0;i<5;i++)
       {
           System.out.println("Enter the participant number");
           ch=sc.nextInt();
           try
           {
             System.out.println("Give the rating to participant"+(i+1));
             r=sc.nextInt();
             if(r<0 || r>11)
              {throw new RatingOutOfRangeError("Rating should be between 1 and 10");
           }

             else
             {
                System.out.println("Rating of player 1 is "+r);
             }
           }
           catch(RatingOutOfRangeError RORE)
           {
              System.out.println("Exception caught");
              System.out.println(RORE.getMessage());
           }

       }
   } 
}
