/**
 * Write a description of class DateEncoder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DateEncoder
{
    static int code;
    public int input()
    {
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        return code;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the six digit code");
        DateEncoder obj=new DateEncoder();
        code=obj.input();//23 01 19
        /*if(code>99999&&code<999999)
        {
            code=code+0;
        }
        else
        {
            code=obj.input();
        }*/
        
        String arr1[]={"Jan","Feb","Mar","April","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        int dd,mm,yy;
        dd=code/100;
        int temp=code/10000;
        mm=temp%100;
        yy=code%100;
        String month=" ";
        yy=2000+yy;
        if(mm==0)
        {
            System.out.println("Invalid month");
        }
        for(int i=0;i<12;i++)
        {
            if(mm==i+1)
            {
                month=arr1[i];
            }
        }
        System.out.print("Month "+month);
    }
}
