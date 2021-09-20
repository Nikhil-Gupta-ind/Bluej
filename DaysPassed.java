/**
 * Write a description of class DaysPassed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DaysPassed
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Date :");
        int dd,DD=sc.nextInt();
        if(DD>0&&DD<=31)
        {
            dd=DD;
        }
        String strm=sc.nextLine();
        int YY,yy=sc.nextInt();
        if(YY>0&&YY<=12)
        {
            yy=YY;
        }
        int mm=0,Sum,A;//A is no. of days passed prevoius of this month
        if(strm=="January")
        {
            mm=1;
        }
        else if(strm=="February")
        {
            mm=2;
        }
        else if(strm=="March")
        {
            mm=3;
        }
        else if(strm=="April")
        {
            mm=4;
        }
        else if(strm=="May")
        {
            mm=5;
        }
        else if(strm=="June")
        {
            mm=6;
        }
        else if(strm=="July")
        {
            mm=7;
        }
        else if(strm=="August")
        {
            mm=8;
        }
        else if(strm=="September")
        {
            mm=9;
        }
        else if(strm=="October")
        {
            mm=10;
        }
        else if(strm=="November")
        {
            mm=11;
        }
        else if(strm=="December")
        {
            mm=12;
        }
        else 
        {
            System.out.println("Invalid month");
        }
        System.out.println("");
        
        int Arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(yy/4==!0)//leap year
        {
            Arr[1]=29;
        }
        for(int i=1;i<mm;i++)
        {
            
        }
        sum=dd+A;
    }
}
