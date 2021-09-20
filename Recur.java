/**
 * Write a description of class Recur here.
 * Recursion
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recur
{
    public void count(int n)
    {
        //Recur obj=new Recur();
        if(n<11)
        {
            System.out.println(n);
            n++;
            count(n);
        }
    }
    public static void main(String args[])
    {
        int n=1;
        Recur o=new Recur();
        o.count(n);
    }
}
