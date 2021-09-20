/**
 * Write a description of class Programm1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DatefromDays
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int d,b;
        String arr1[]={"Jan","Feb","Mar","April","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        int arr2[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int i=1;
        int dd,mm,count=0;
        System.out.println("Enter year :");
        int y=sc.nextInt();//also limit year pls.
        int yy=0;
        if(y>1000&&y<9999)
        {
            yy=y;
        }
        if(yy%4==0)
        {
            arr2[1]=29;
        }
        
        System.out.println("Enter no. of days");
        d=sc.nextInt();
        int copyd=d;
        for(i=0;i<=11;i++)
        {
            if(d>0)
            {
                d=d-arr2[i];
                count++;
            }
            if(d<=31)
            {
                break;
            }
        }
        System.out.println("Date: "+d+" "+arr1[count]);
        System.out.println("Enter the no. of days postponded");
        b=sc.nextInt();
        count=0;
        copyd=copyd+b;
        if(yy%4!=0)
        {
            if(copyd>=366)
            {
                copyd=b;
            }
        }
        else
        {
            if(copyd>=365)
            {
                copyd=b;
            }
        }
        for(int j=0;j<=11;j++)
        {
            copyd=copyd-arr2[j];
            count++;
            if(copyd<=31)
            {
                break;
            }
        }
        System.out.println("Date: "+copyd+" "+arr1[count]);
    }
}
