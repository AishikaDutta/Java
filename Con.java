class Outer
{
    void input1( )
    {
        class Inner
        {
            StringBuffer input2()
            {
            
                StringBuffer s1=new StringBuffer("Aishika");
                StringBuffer s2=new StringBuffer("Dutta");
                StringBuffer str=s1.append(s2);
                return str;
            }
        }
        Inner in=new Inner();
        StringBuffer str1=in.input2();
        for(int i=0;i<str1.length();i++)
        {
           if(str1.charAt(i)=='a' || str1.charAt(i)=='e' ||str1.charAt(i)=='i'|| str1.charAt(i)=='o'||str1.charAt(i)=='u')
           {
               str1.replace(i,i+1,"*");
           }
        }
        System.out.println(str1);
        
    }
}
class Con
{
    public static void main(String args[])
    {
        Outer out=new Outer();
        out.input1();
    }
}