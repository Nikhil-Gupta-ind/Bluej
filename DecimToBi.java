/**
 * Write a description of class DecimToBi here.
 * Decimal to Binary
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class DecimToBi
{
    public static void main(String argsg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        int Q,R,temp;
        //int arr[]=new int[];
        String str=" ";
        int k=0;
        for(int i=0;;i++)
        {
            Q=num/2;
            R=num%2;
            //arr[k]=R;
            str=R+str;
            temp=num;
            num=Q;
            
            if(Q==1)
            {
                str=Q+str;//arr[k+1]=Q;
                break;
            }
            k++;
        }
        System.out.print("The number in binary is "+str);
        /*for(int j=arr.length-1;j>=0;j--)
        {
            System.out.print(arr[j]);
        }
        System.out.println("");*/
    }
}
