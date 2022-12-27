abstract class Shape{
int dim;
abstract void area(int dim);}
class Rectangle extends Shape{
int other_dimension;
void getDim(int od){other_dimension=od;}
void area(int dim){
int ar=dim*other_dimension;
System.out.println("The area is: "+ar);}}
public class Abst{
public static void main(String []args)
{Rectangle rect=new Rectangle();
rect.getDim(10);
rect.area(20);
}}
