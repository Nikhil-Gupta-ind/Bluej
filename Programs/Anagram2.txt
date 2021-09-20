
/**
 * Write a description of class Anagram2 here.
 * Anagram
 * @author NIKHIL GUPTA 
 * @version 2.0
 */
import java.io.*;
public class Anagram2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a four letered word");
        String str=obj.readLine();
        int l=str.length();
        char arr[];
        for(int i=0;i<4;i++)
        {
            arr[i]=str.charAt(i);
            
        }
    }
}
