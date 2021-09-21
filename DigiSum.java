/**
 * Write a description of class DigiSum here.
 * 
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DigiSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number");
        int num=sc.nextInt();
        int r,q,temp;
        int sum=0;
        for(int i=0;;i++)
        {
            r=num%10;
            sum=sum+r;
            q=num/10;
            temp=num;
            num=q;
            r=q%10;
            if(sum==1)
            {
                System.out.print(sum);
            }
        }
        
    }
}
