import java.util.Scanner;
class NegativeFactorialException extends Exception  
{  
    public NegativeFactorialException(String str)  
    {   
        super(str);  
    }  
}
public class Excep2  
{  
    public static void main(String args[])  
    {  
        Scanner sc=new Scanner(System.in);
        try  
        {    
            System.out.println("Enter a number to find factorial");
            int a=sc.nextInt();
            int f=1;
            if(a<0)
            throw new NegativeFactorialException("Factorial of a negative number not possible"); 
            else
            {
                for(int i=1;i<=a;i++)
                {
                    f=f*i;
                }
                System.out.println("Factorial of "+a+" = "+f);
            } 
        }  
        catch (NegativeFactorialException NFE)  
        {    
            System.out.println(NFE.getMessage());  
        }
    }
}  
