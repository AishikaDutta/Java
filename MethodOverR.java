class Father
{  
   void home()
   {
       System.out.println("House :3BHK Flat");
   }
   void buisness()
   {
       System.out.println("Buisness :Textile Industry");
   }
   void car()
   {
       System.out.println("Car :Mahindra Bolero");
   }
}
class Son extends Father
{
  void car()
  {
      System.out.println("Car :KIA Carens");
  }
}
class MethodOverR
{
public static void main(String args[])
{
Son s=new Son();
s.home();
s.buisness();
s.car();
}
}
