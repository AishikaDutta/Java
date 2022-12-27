 import java.util.Scanner;
 class Scanner1
 {
 	public static void main(String [] args)
 	{
 		Scanner in=new Scanner(System.in);
 		System.out.println("Enter your name: ");
 		String name=in.nextLine();
 		System.out.println("Enter your age: ");
 		int age=in.nextInt();
 		in.close();
 		System.out.println("\nYour details: \n");
 		System.out.println(" "+name+" "+age+" ");
 	}
 }