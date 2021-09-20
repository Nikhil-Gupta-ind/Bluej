
/**
 * Write a description of class ISBN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ISBN
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("INPUT CODE :");
        int input=sc.nextInt();
        int num=0,sum=0;
        int output;
        int a=1000000000;
        String str=Integer.toString(input);
        System.out.print(str.length());
        if(/*str.length()==10(input/a)>=1*/)
        {
            num=input;
            System.out.print("OUTPUT :");
            for(int i=10;i>0;i--)
            {
                sum=sum+(i*(num/a));
                System.out.println(sum+" ");
                a=a/10;
            }
            System.out.println("SUM = "+sum);
            if(sum%11==0)
            {
                System.out.println("LEAVES NO REMAINDER-VALID ISBN CODE");
            }
            else
            {
                System.out.println("LEAVES REMAINDER-INVALID ISBN CODE");
            }
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}
