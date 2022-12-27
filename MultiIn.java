import java.util.Scanner;
abstract class Person
{
    int age=27;
    abstract void input_name();
}
interface EligibilityCriteria
{
    int exp=5;
    void eligibility();
}
class Employee extends Person implements EligibilityCriteria
{
    void input_name()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.next();
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        sc.close();
    }
    public void eligibility()
    {
       if(exp>=4)
       {
           System.out.println("Eligible for the job");
       }
        else
        {
            System.out.println("Not eligible for the job");
        }
    }
}
public class MultiIn
{
    public static void main(String args[])
    {
        Employee E=new Employee();
        E.input_name();
        E.eligibility();
    }
}
