/**
 * Write a description of class PowerRec here.
 * Recursion
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
import java.io.*;
public class PowerRec
{
    public static void main(String args[])
    {
        PowerRec ob=new PowerRec();
        long a,b,res;
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the value of a :");
            a=Long.parseLong(br.readLine());
            System.out.print("Enter the Value of b :");
            b=Long.parseLong(br.readLine());
            res=ob.pow(a,b);
            System.out.println(a+"^"+b+":"+res);
        }
        catch(Exception e)
        {
            System.out.println(e);
            
        }
    }
    private long pow(long m,long n)
    {
        if(n==1)
        {
            return m;
        }
        else
        {
            return(m*pow(m,n-1));
        }
    }
}
