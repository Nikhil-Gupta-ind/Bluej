/**
 * Write a description of class Pattern1 here.
 * 
 * @author Nikhil Gupta ©2017-21
 * @version (a version number or a date)
 */

public class Pattern1
{
    public static void main(String args[])
    {
        String Str="XAVIER";
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(Str.charAt(j));
            }
            System.out.println();
        }
    }
}
