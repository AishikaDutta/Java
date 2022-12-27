interface Cube
{
    int n=12;
    void cube();
}
interface Square
{
    int m=9;
    void square();
}
class Power implements Cube,Square
{
    public void square()
    {
        System.out.println("Square of "+m+" is "+(m*m));
    }
    public void cube()
    {
        System.out.println("Cube of "+n+" is "+(n*n*n));
    }
}
public class MulIn1
{
    public static void main(String args[])
    {
        Power P=new Power();
        P.square();
        P.cube();
    }
}
