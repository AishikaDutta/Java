class CLanguage
{
    void c_feature()
    {
        System.out.println("\nC has a rich set of libraries");
        System.out.println("Is a middle level language");
    }
}
class CPPLanguage extends CLanguage
{
      void cpp_feature()
      {
          System.out.println("C++ is a object oriented language");
          System.out.println("Supports both user-defined and built-in datatypes");
      }
}
class JAVALanguage extends CPPLanguage
{
    void j_feature()
    {
        System.out.println("Java is an OOP language and supports Multithreading");
        System.out.println("Robust in nature and Platform Independent");
    }
}
class MultiInher
{
    public static void main(String args[])
    {
       JAVALanguage J1=new JAVALanguage();
       J1.c_feature();
       J1.cpp_feature();
       J1.j_feature();
    }
}