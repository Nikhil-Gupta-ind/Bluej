import java.util.*;
import java.io.*;
class Ex
{
    public static void main (String ags[])throws IOException
    {
        InputStreamReader objISR=new InputStreamReader(System.in);
        BufferedReader obj=new BufferedReader(objISR);
        System.out.println("Enter an alphabet");
        char input=(char)obj.read();
        int a=input;
        if(input=='Z')
        {
            System.out.println('B');
        }
        else if(input=='z')
        {
            System.out.println('b');
        }
        else
        {
            System.out.println((char)(a+1));
        }
    }
}