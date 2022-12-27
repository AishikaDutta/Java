import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.text.DefaultStyledDocument.ElementSpec;
class FileHand1
{
    public static void main(String args[])
    {
        try
        {
            File f=new File("D:\\Semester 4\\CAP 392- Fundamentals of Java Programming\\Files\\MyFile.txt");
            if(f.createNewFile())
                System.out.println("File "+f.getName()+" created successfully!");
            else
                System.out.println("File already exists in the directory");
            FileWriter fw=new FileWriter("D:\\Semester 4\\CAP 392- Fundamentals of Java Programming\\Files\\MyFile.txt");
            fw.write("Java is one of the leading programming languages in the world");
            fw.close();
            System.out.println("Content successfully written to the file");
            Scanner sc=new Scanner(f);
            int vow=0,con=0,digit=0,space=0;
            while(sc.hasNextLine())
            {
                String str=sc.nextLine();
                for(int i=0;i<str.length();i++)
                {
                    char ch =str.charAt(i);
                    if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
                        vow++;
                    else 
                        con++;
                    if(ch=='1' || ch== '2' || ch== '3'|| ch== '4'|| ch== '5'|| ch== '6'|| ch== '7'|| ch== '8'|| ch== '9'|| ch== '0')
                        digit++;
                    if(ch==' ')
                        space++;
                
                }
                //System.out.println("No of vowels= "+count);
            }
            System.out.println("No of vowels= "+vow);
            System.out.println("No of consonants= "+(con-space));
            System.out.println("No of digits= "+digit);
            System.out.println("No of whitespace= "+space);
            System.out.println("No of words= "+(space+1));
            sc.close();
            
        }
        catch(IOException e)
        {
            System.out.println("Unexpected error occured");
            e.printStackTrace();
        }
    }
}