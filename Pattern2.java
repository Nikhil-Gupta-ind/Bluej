/**
 * Write a description of class Pattern2 here.
 * 
 * @author Nikhil Gupta ©2017-21
 * @version (a version number or a date)
 */
public class Pattern2
{
    public static void main(String args[])
    {
        String Str="****";
        for(int i=4;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(Str.charAt(j));
            }
            System.out.println();
        }
    }
}
