import java.util.Scanner;
interface Shape
{
    void area();
    void perimeter();
}
class Circle implements Shape
{
    double r;
    public void input(double radius)
    {
        r=radius;
    }
    public void area()
    {
        System.out.println("Area of the circle = "+(3.14*r*r));
    }
    public void perimeter()
    {
        System.out.println("Circumference of the circle = "+(2*3.14*r));
    }
}
class Rectangle implements Shape
{
    double l,b;
    public void input1(double length,double breadth)
    {
        l=length;
        b=breadth;
    }
    public void area()
    {
        System.out.println("Area of the rectangle = "+(l*b));
    }
    public void perimeter()
    {
        System.out.println("Perimeter of the rectangle = "+(2*(l+b)));
    }
}
public class Sample
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter radius of the circle : ");
    double radius=sc.nextDouble();
    Circle C=new Circle();
    C.input(radius);    
    C.area();
    C.perimeter();
    System.out.println("Enter length and breadth of the rectangle : ");
    double length=sc.nextDouble();
    double breadth=sc.nextDouble();
    Rectangle R=new Rectangle();
    R.input1(length, breadth);
    R.area();
    R.perimeter(); 
    sc.close();
    }
}
