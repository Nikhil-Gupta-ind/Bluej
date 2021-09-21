/**
 * Write a description of class newDate here.
 * 
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class newDate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter date : ");
        int dd=0,mm=0,yyyy=0,DD,MM,YYYY;
        
            DD=sc.nextInt();
            System.out.print("/");
            if(DD>0&&DD<=31)
            {
                dd=DD;
            }
            
            MM=sc.nextInt();
            System.out.print("/");
            if(MM>0&&MM<=12)
            {
                mm=MM;
            }
            
            YYYY=sc.nextInt();
            System.out.print("/");
            if((YYYY>999)&&YYYY<=9999)
            {
                yyyy=YYYY;
            }
        
        System.out.println("");
        System.out.println(dd+"/"+mm+"/"+yyyy);
        if((dd==0)||(mm==0)||(yyyy==0))
        {
            System.out.println("Invalid date");
        }
        else
        {
            System.out.println("Date is valid");
        }
        
            if(yyyy%4==0)
            {
                if(mm==2)
                {
                    if(DD>29)
                    {
                        System.out.println("leap year,Invalid Date");
                    }
                }
            }
            
               if(mm%2==0)
               {
                   if(dd>30)
                   {
                       System.out.println("invalid date no. of days exceeds the no. of day in that month");
                   }
               }
               else if(mm==2)
               {
                   if(dd>28)
                   {
                       System.out.println("Invalid Date after checking feb");
                   }
               }
    }
}