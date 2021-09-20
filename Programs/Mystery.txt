/**
 * Write a description of class Rec here.
 * Recursion
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mystery
{
    public void run()
    {
        int result=compute(4);
        System.out.println(result);
    }
    public int compute(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*compute(n-1);
        }
    }
    public static void main(String args[])
    {
        Mystery m1=new Mystery();
        m1.run();
    }
}
