
/**
 * Write a description of class Kaprekar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Kaprekar
{
    static int p,q;
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Kaprekar obj=new Kaprekar();
        System.out.print(" ");
         p=sc.nextInt();
         q=sc.nextInt();
        System.out.println("INPUT:");
        System.out.println("p="+p);
        System.out.println("Q="+q);
        System.out.println("OUTPUT:");
        System.out.println("THE KAPREKAR NUMBERS ARE:-");
        int result;
       
        System.out.println("");
    }
    public void kNumber()
    {
         for(int i=p;i<q;i++)
       {
            //result=obj.kNumber(i);
            //System.out.print(result+", ");
        //}
        int d;//no. of digits of n
        if((i/1000)>1)
        {
            d=4;
        }
        else if((i/100)>1)
        {
            d=3;
        }
        else if((i/10)>1)
        {
            d=2;
        }
        else
        {
            d=1;
        }
        int num=i*i;
        int RHP,LHP;
        if(d==4)
        {
            RHP=num%10000;
            LHP=num/10000;
        }
        else if(d==3)
        {
            RHP=num%1000;
            LHP=num/1000;
        }
        else if(d==2)
        {
            RHP=num%100;
            LHP=num/100;
        }
        else
        {
            RHP=num%10;
            LHP=num/10;
        }
        
        if(RHP+LHP==i)
        {
            System.out.print(i+", ");
        }
        }
    }
}