import java.util.Scanner;
class Extr1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line of String");
        String str=sc.nextLine();
        sc.close();
        int ar[]=new int[15];
        str.trim();
        str=str+" ";
        int j=0,i=1;
        int first=0;
        int last=str.indexOf(" ");
        while(i!=0)
        {
           String str1=str.substring(first,last);
           int n=str1.length();
           ar[j]=n;
           j++;
           first=last;
           last=str.indexOf(" ",first);
           if(last==str.length())
           {
               i=0;
           }
           else
           {
               i=1;
           }
        }
        for(i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}
