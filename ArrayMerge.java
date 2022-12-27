import java.util.Scanner;
class ArrayMerge
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of terms for 1st array");
       int n=sc.nextInt();
       System.out.println("Enter number of terms for 2nd array");
       int m=sc.nextInt();
       int a[]=new int[n];
       int b[]=new int[m];
       int c[]=new int[m+n];
       System.out.println("Enter elements to the first array:");
       for(int i=0;i<n;i++)
       {
            a[i]=sc.nextInt();
       }
       System.out.println("Enter elements to the second array:");
       for(int i=0;i<m;i++)
       {
            b[i]=sc.nextInt();
       }
       int i=0,j=0,k=0;
       while(i<n && j<m)
    {
        if(a[i]<b[j])
        {
            c[k]=a[i];
            k++;
            i++;
        }
        else
        {
            c[k]=b[j];
            k++;
            j++;
        }
    }
    while(i<n)
    {
        c[k]=a[i];
            k++;
            i++;
    }
    while(j<m)
    {
       c[k]=b[j];
            k++;
            j++;
    }
    System.out.println("\nMerged Array:");
    for(i=0;i<n+m;i++)
    {
       System.out.print(" "+c[i]);
    }

   }
}
