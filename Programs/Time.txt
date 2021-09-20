/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Time
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int input=sc.nextInt(),Q,R;
        String s="",s2="";
        String Arr1[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};
        String Arr3[]={"past","quater","to","O' Clock"};
        Q=input/100;
        R=input%100;
        if(R==00)
        {
            int j=1;
            for(int i=0;i<12;i++)
            {
                if(Q==j)
                {
                    s=Arr1[i];break;
                }
                j++;
            }
            System.out.println(s+" "+Arr3[3]);
        }
        else if((R>0)&&(R<15))
        {
            System.out.println(R+" past "+Q);
        }
        else if(R==15)
        {
            System.out.println("Quater past "+Q);
        }
        else if((R>15)&&(R<30))
        {
            System.out.println(R+" past "+Q);
        }
        else if(R==30)
        {
            System.out.println("Half past "+Q);
        }
        else if((R>30)&&(R<45))
        {
            System.out.println(60-R+" to "+(++Q));
        }
        else if(R==45)
        {
            System.out.println("Quarter to "+(++Q));
        }
        else if((R>45)&&(R<60))
        {
            System.out.println(60-R+" to "+(++Q));
        }
        else
        {
            System.out.println("INVALID TIME");
        }
    }
}
