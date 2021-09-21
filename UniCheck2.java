/**
 * Write a description of class UniCheck2 here.
 * Programm to check wether the number is unique.
 * The Number is unique if any of its digit is repeated in it.
 * @author Nikhil Gupta ©2018-21
 * @version 2.0
 */
import java.util.Scanner;
public class UniCheck2
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
        int b=0;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    b=1;
                }
            }
        }
        if(b==1)
        {
            System.out.println("This is not a unique number");
        }
        else if(b==0)
        {
            System.out.println("This is a unique number");
        }
    }
}
