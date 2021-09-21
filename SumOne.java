/**
 * Write a description of class SumOne here.
 * Programm to check resultant sum of digits is 1 from 1 to 1000
 * @author Nikhil Gupta ©2017-21
 * @version (a version number or a date)
 */
public class SumOne
{
    static int a;
    static int b;
    static int c;
    static int d;
    static int sum;
    static int temp;
    public static int sum(int num)
    {
        if(num<=100)//for two digit number
        {
            a=num/10;//extract the first digit
            b=num%10;//extract the last digit
            sum=a+b;
            return sum;
        }
        else//for three digit number
        {
            a=num/100;//first digit
            b=num%10;//last digit
            c=num%100-b;//extract the middle digit
            sum=a+b+c;
            return sum; 
        }
    }
    public static void main(String args[])
    {
        SumOne S=new SumOne();
        int n;
        int s; 
        for(int i=1;1<=1000;i++)
        {
           n=i;
           s=S.sum(n);
            if(s==1)
            {
                System.out.println(n);
            }
            else
           {
               s=S.sum(s);
               if(s==1)
               {
                   System.out.println(n);
                   if(n==1000)
                   {
                       break;
                   }
               }
           }
        }
        
    }
}
