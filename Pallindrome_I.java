/**
 * Write a description of class PallindromeI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Pallindrome_I
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        int rev=0;
        int i=10;
        while(i>0)
        {
            int N=num%10;
            rev=rev+N;
            i++;
        }
        if(num==rev)
        System.out.println("The Entered Number "+num+" is not a Pallindrome number");
        else
        System.out.println("The Entered Number "+num+" is a Pallindrome number");
    }
}
