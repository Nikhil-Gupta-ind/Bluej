
/**
 * Write a description of class Bank here.
 * 
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Bank
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount ");
        int Input=sc.nextInt();
        int Amt=0;
        if(Input>=0&&Input<=99999)
        {
            Amt=Input;
        }
        else
        {
            System.out.println("INVALID AMOUNT");
        }
        String Amt1;
        String arr[]={"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        
        int Den[]={1000,500,100,50,5,1};//Denomination
        int Quo,sum=0,a;
        System.out.println("DENOMINATIONS:");
        for(int j=0;j<=5;j++)
        { 
            Quo=Amt/Den[j];
            a=Den[j]*Quo;
            Amt=Amt%Den[j];
            System.out.println(" "+Den[j]+" * "+Quo+" = "+a);
            sum=sum+Quo;
        }
        System.out.println("TOTAL NUMBER OF NOTES = "+sum);
    }
}
