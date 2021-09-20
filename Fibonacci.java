
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String args[])
    {
        int a=0, b=1, sum, Temp;
        System.out.print(" "+a+" "+b);
        for(int i=1; i<=10;i++)
        {
            sum=a+b;
            System.out.print(" "+sum+" ");
            Temp=b;
            b=sum;
            a=Temp;
        }
    }
}
