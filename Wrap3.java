import java.util.Scanner;
public class Wrap3
{
public static int duplicacy(Integer array[], int n)
{
if (n==0 || n==1)
    return n;
int ar[] = new int[n];
int j = 0;
for (int i=0; i<n-1; i++)
if (array[i] != array[i+1])
ar[j++] = array[i];
ar[j++] = array[n-1];
for (int i=0; i<j; i++)
   array[i] = ar[i];
return j;
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter no. of elements you want in array:");
int n = sc.nextInt();
Integer a[] = new Integer[n+1];
System.out.println("Enter all the elements:");
for(int i = 0; i < n; i++)
{
a[i] = sc.nextInt();
}
n=duplicacy(a, n);
System.out.print("Array after removing duplicacy: ");
for (int i=0; i<n; i++)
System.out.print(a[i] +" ");
sc.close();

}
}
