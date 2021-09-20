
/**
 * Write a description of class SpecialPrimeNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class SpecialPrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int I=sc.nextInt();
        int Prime[]={0,0,0,0,0,0,0,0,0,0};
        int j=0;
        for(int i=2;i<=I/2;i++)
        {
            if(((i/1==0)&&(i/i==0))&&(i/i+1==))
            {
                Prime[j]=i;
            }
            j++;
        }
        for(int k=0;k<Prime.length;k++)
        {
            System.out.println(Prime[k]);
        }
        /*if(the number is a sum of two prime numbers)
        {
            System.out.println("This is a Special Number");
        }
        else
        {
            System.out.println("This is a not Special Number");
        }*/
        
    }
}
