/**
 * Write a description of class EncoAndDeco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class EncoAndDeco
{
    int  BiToDeci(int Val)//Decoder
    {
        String num=Integer.toString(Val);
        
        String arr[]=num.split("\\s+");
        int len=arr.length;
        int Out=0;
        int temp,temp2;
        int k=0;
        for(int i=len;i>=0;i--)
        {
            temp=Integer.parseInt(arr[k]);
            temp2=(int)Math.pow(2*temp,i);
            Out=Out+temp2;
            k++;
        }
        return Out;
    }
    String DeciToBi(int Val)//Encoder
    {
        int Quo,Rem;
        int arr[]={},Out[]={};
        String str1="", str2="";
        for(int i=0;;i++)
        {
            Quo=Val/2;
            Rem=Val%2;
            str2=Integer.toString(Rem);
            if(Quo==1)
            {
                break;
            }
        }
        int k=0;
        
        int len=arr.length;
        for(int j=len;j>0;j++)
        {
            Out[k]=arr[j];
            k++;
        }
        for(int l=0;l<Out.length;l++)
        {
            str1=str1+Integer.toString(Out[l]);
        }
        return str1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        EncoAndDeco obj=new EncoAndDeco();
        System.out.println("For Conversion from :");
        System.out.println("Binary To Decimal Enter 1");
        System.out.println("Decimal To Binary Enter 2");
        int Input=sc.nextInt();
        System.out.println("Enter the Number to be converted");
        int Value=sc.nextInt();
        int result=0,Result[];
        if(Input==1)
        {
            //result=obj.BiToDeci(Value);
            System.out.println("The Number after Conversion is :"+obj.BiToDeci(Value));
        }
        else if(Input==2)
        {
            System.out.println("The Number after Conversion is :"+obj.DeciToBi(Value));
        }
        else
        {
            System.out.println("!!Invalid!!");
        }
        //System.out.println("The Number after Conversion is :"+result);
    }
}