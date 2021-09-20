//This programm displays corresponding date of any day in a year
import java.io.*;
class Date2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader objISR=new InputStreamReader(System.in);
        BufferedReader objBR=new BufferedReader(objISR);
        System.out.println("Enter a day which lie in a year");
        int day=Integer.parseInt(objBR.readLine());
        String month="";
        int date=1;
        if(day>=1&&day<=31)
        {
            month="January";
            date=day;
            System.out.println(date+" "+month);
        }
        else if(day>=32&&day<=59)
        {
            month="February";
            date=day-31;
            System.out.println(date+" "+month);
        }
        else if(day>=60&&day<=90)
        {
            month="March";
            date=day-59;
            System.out.println(date+" "+month);
        }
        else if(day>=91&&day<=120)
        {
            month="April";
            date=day-90;
            System.out.println(date+" "+month);
        }
        else if(day>=121&&day<=151)
        {
            month="May";
            date=day-120;
            System.out.println(date+" "+month);
        }
        else if(day>=152&&day<=181)
        {
            month="June";
            date=day-151;
            System.out.println(date+" "+month);
        }
        else if(day>=182&&day<=212)
        {
            month="July";
            date=day-181;
            System.out.println(date+" "+month);
        }
        else if(day>=213&&day<=243)
        {
            month="August";
            date=day-212;
            System.out.println(date+" "+month);
        }
        else if(day>=244&&day<=273)
        {
            month="September";
            date=day-243;
            System.out.println(date+" "+month);
        }
        else if(day>=274&&day<=304)
        {
            month="October";
            date=day-273;
            System.out.println(date+" "+month);
        }
        else if(day>=305&&day<=334)
        {
            month="November";
            date=day-304;
            System.out.println(date+" "+month);
        }
        else if(day>=335&&day<=365)
        {
            month="December";
            date=day-334;
            System.out.println(date+" "+month);
        }
        else
        {
            System.out.println("INVALID");
        }
    }
}