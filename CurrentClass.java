package CurrentPack;
import OperationsPack.OperationsClass;
import java.util.Scanner;
public class CurrentClass
{
    public static void main(String args[])
    {
        OperationsClass OC=new OperationsClass();
        System.out.println("\nEnter a number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        OC.oddEven(x);
        OC.prime(x);
        OC.armstrong(x);

    }
}
