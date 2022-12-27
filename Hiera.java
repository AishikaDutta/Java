import java.util.Scanner;
class Person
{
    String name;
    int id;
    void display(String n,int i)
    {
        name=n;
        id=i;
        System.out.println("Name: "+name);
        System.out.println("ID  : "+id);
    }
}
class Student extends Person
{
    String course;
    int year;
    void s_display(String c,int y)
    {
        course=c;
        year=y;
        System.out.println("Course opted: "+course);
        System.out.println("Current year of study: "+year);

    }
}
class Faculty extends Person
{
    String dep,sub;
    void f_display(String d,String s)
    {
        dep=d;
        sub=s;
        System.out.println("Department: "+dep);
        System.out.println("Course taught: "+sub);
    }
}
class Hiera
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("\nEnter name of the faculty");
       String s1=sc.next();
       System.out.println("Enter name of the student");
       String s2=sc.next();
       System.out.println("Enter id of the faculty");
       int i1=sc.nextInt();
       System.out.println("Enter id of the student");
       int i2=sc.nextInt();
       System.out.println("Enter course student has enrolled in");
       String c1=sc.next();
       System.out.println("Enter current course year of the student");
       int y=sc.nextInt();
       System.out.println("Enter department of the faculty");
       String d=sc.next();
       System.out.println("Enter course the faculty teaches");
       String c2=sc.next();
       sc.close();
       System.out.println("\nStudent Details :");
       Student S=new Student();
       S.display(s2,i2);
       S.s_display(c1,y);
       System.out.println("\nFaculty Details :");
       Faculty F=new Faculty();
       F.display(s1,i1);
       F.f_display(d,c2);        
   } 
}
