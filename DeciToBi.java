import java.util.Scanner;
public class DeciToBi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal");
        int n=sc.nextInt(),a;
        String x=" ";
        while(n>0)
        {
            a=n%2;
            x=x+a;
            n=n/2;
        }
        int l=x.length();
        while(l>0)
        {
            System.out.print(""+x.charAt(l-1));
            l--;
        }
        System.out.println();
    }
}