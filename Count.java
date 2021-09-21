/**
 * Write a description of class Count here.
 * 
 * @author Nikhil Gupta ©2017-21
 * @version (a version number or a date)
 */
//Programm
import java.io.*;
public class Count
{
    static int Sum2=0;
    public int vowel(int len, String st)
    {
        for(int j=0;j<len;j++)
        {
            if (st.charAt(j)=='a' || st.charAt(j)=='e' || st.charAt(j)=='i' || st.charAt(j)=='o' || st.charAt(j)=='u' || st.charAt(j)=='A' ||st.charAt(j)=='E' ||st.charAt(j)=='I' ||st.charAt(j)=='O' ||st.charAt(j)=='U')
            {
                Sum2++;
            }
        }
        return Sum2;
    }
    public static void main(String []args)throws IOException
    {
        InputStreamReader Obj =new InputStreamReader(System.in);
        BufferedReader Br =new BufferedReader(Obj);
        System.out.println("Please enter a Line");
        String st=Br.readLine().trim();
        int Sum=0;
        int len=st.length();
        for(int i=0;i<len;i++)
        {
            if(st.charAt(i)==' ')
            {
                Sum++;
            }
        }
        System.out.println("no. of words: "+ Sum+1);
        Count C=new Count();
        C.vowel(len,st);
        System.out.println("No. of Vowels: "+ Sum2);
    }
}