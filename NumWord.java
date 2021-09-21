/**
 * Write a description of class NumWord here
 * 
 * @author Nikhil Gupta ©2017-21
 * @version (a version number or a date)
 */
import java.io.*;
class NumWord
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader objISR=new InputStreamReader(System.in);
        BufferedReader objBR=new BufferedReader(objISR);
        System.out.println("Enter a Number");
        int Num=Integer.parseInt(objBR.readLine());
        String Num_in_word="";
        String Basic="";//one,two,three,...,fifteen(leaving fourteen)
        String Base="";
        String SuperBase="";
        int temp1;
        int temp2;
        if(Num>=0&&Num<=19)
        {
            switch(Num)
            {
                case 0:
                Basic="Zero";
                case 1:
                Basic="one";
                break;
                case 2:
                Basic="two";
                break;
                case 3:
                Basic="three";
                break;
                case 4:
                Basic="four";
                break;
                case 5:
                Basic="five";
                break;
                case 6:
                Basic="six";
                break;
                case 7:
                Basic="seven";
                break;
                case 8:
                Basic="eight";
                break;
                case 9:
                Basic="nine";
                break;
                case 10:
                Basic="ten";
                break;
                case 11:
                Basic="eleven";
                break;
                case 12:
                Basic="twelve";
                break;
                case 13:
                Basic="thirteen";
                break;
                case 14:
                Basic="fourteen";
                break;
                case 15:
                Basic="fifteen";
                break;
                case 16:
                Basic="sixteen";
                break;
                case 17:
                Basic="seventeen";
                break;
                case 18:
                Basic="eighteen";
                break;
                case 19:
                Basic="nineteen";
                break;
            }
        }
        else if(Num>=20&&Num<=100)
        {
            temp1=Num%10;
            switch(temp1)
            {
                case 0:
                Basic="";
                case 1:
                Basic="one";
                break;
                case 2:
                Basic="two";
                break;
                case 3:
                Basic="three";
                break;
                case 4:
                Basic="four";
                break;
                case 5:
                Basic="five";
                break;
                case 6:
                Basic="six";
                break;
                case 7:
                Basic="seven";
                break;
                case 8:
                Basic="eight";
                break;
                case 9:
                Basic="nine";
                break;
            }
            temp2=Num-temp1;
            switch(temp2)
            {
                case 20:
                Base="twenty";
                break;
                case 30:
                Base="thirty";
                break;
                case 40:
                Base="fourty";
                break;
                case 50:
                Basic="fifty";
                break;
                case 60:
                Basic="sixty";
                break;
                case 70:
                Basic="seventy";
                break;
                case 80:
                Basic="eighty";
                break;
                case 90:
                Basic="ninety";
                break;
                case 100:
                Basic="hundred";
                break;
            }
        }
        
        else
        {
            System.out.println("Please enter a Number between 0 to 999");
        }
        Num_in_word=SuperBase+""+Base+" "+Basic;
        System.out.println(Num_in_word);
    }
}