import java.util.Scanner;
class Str1
{    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter First Name : ");
        String fname=sc.next();
        System.out.print("\nEnter Middle Name : ");
        String mname=sc.next();
        System.out.print("\nEnter Last Name : ");
        String lname=sc.next();
        sc.close();
        String s1="KUMAR";
        String s2="SINGH";
        String s=fname+mname+lname;
        int fn=fname.length();
        int ln=lname.length();
        int full=s.length();
        System.out.println("Full Name: "+s);
        String s3=s.substring(fn,(full-ln));
        StringBuffer sb=new StringBuffer(s);
        if(s3.equalsIgnoreCase(s1)|| s3.equalsIgnoreCase(s2))
        {
            sb.delete(fn,(full-ln));
            System.out.println(sb); 
        }
        else
        {
            System.out.println(sb);
        }         
    }
}
