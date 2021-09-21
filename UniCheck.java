
/**
 * Write a description of class UniCheck here.
 * Programm to check wether the number is unique.
 * The Number is unique if any of its digit is repeated in it.
 * @author Nikhil Gupta ©2018-21
 * @version 1.0
 */
import java.util.Scanner;
public class UniCheck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=sc.nextInt();
        String str=Integer.toString(input);
        int l=str.length();
        //System.out.println(str);
        //System.out.println(l);
        
        char num[]=new char[l];
        for(int i=0;i<l;i++)
        {
            num[i]=str.charAt(i);
            //System.out.println(num[i]);
        }
        int b=0;
        for(int j=0;j<l;j++)
        {
            for(int k=j+1;k<l;k++)
            {
                if(num[j]==num[k])
                {
                    b=1;
                }
            }
        }
        if(b==1)
        {
            System.out.println("This is not a unique number");
        }
        else
        {
            System.out.println("This is a unique number");
        }
    }
}
