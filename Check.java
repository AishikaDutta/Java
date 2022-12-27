import Numeric.EvenClass;
import Numeric.OddClass;
public class Check
{
   public static void main(String args[]) 
   {
       OddClass od=new OddClass();
       EvenClass ev=new EvenClass();
       int arr[]={12,23,34,45,56,67,78,89};
       od.checkOdd(arr);
       ev.checkEven(arr);
   }
}
