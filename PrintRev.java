
/**
 * Write a description of class PrintRev here.
 * Recursion
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
class PrintRev
{
    public static void main(String args[])
    {
        PrintRev ob=new PrintRev();
        System.out.println("Enter characters(.) to end :");
        ob.print_backwards();
        System.out.println();
    }
    private void print_backwards()
    {
        char ch;
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            ch=(char)System.in.read();
            if(ch!='.')
            {
                print_backwards();
                System.out.print(ch);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
