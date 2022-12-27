import java.util.Scanner;
class NegativeDistanceException extends Exception  
{  
    public NegativeDistanceException(String str)  
    {   
        super(str);  
    }  
}   
public class Excep1  
{  
    public static void main(String args[])  
    {  
        Scanner sc=new Scanner(System.in);
        try  
        {    
            System.out.println("Enter 2 distances");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<0 || b<0)
            throw new NegativeDistanceException("Distance cannot be negative!"); 
            else
            System.out.println("Sum of the distances ="+(a+b)); 
        }  
        catch (NegativeDistanceException NDE)  
        {    
            System.out.println(NDE.getMessage());  
        }  
    }  
}   