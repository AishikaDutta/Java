import java.util.Scanner;
class Phone
{
    double dim;
    String s;
    void display(double d)
    {
        dim=d;
        System.out.println("Size of the phone: "+dim+" inch");
    }
    void security(String security)
    {
        s=security;
        System.out.println("Security type: "+s);
    }

}
class Iphone extends Phone
{
    String c;
    void camera(String cam)
    {
        c=cam;
        System.out.println("Camera type: "+c);
    }
}
class Inher1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter dimension of the phone: ");
        double d=sc.nextDouble();
        System.out.print("\nEnter security type of the phone: ");
        String security=sc.next();
        System.out.print("\nEnter camera type of the phone: ");
        String cam=sc.next();
        sc.close();
        Iphone I1=new Iphone();
        I1.display(d);
        I1.security(security);
        I1.camera(cam);

    }
}
