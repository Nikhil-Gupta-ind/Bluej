/**
 * Description of class DoubleDimensional here:
 * Programm to find the sum of numbers present in double dimensional array
 * @author Nikhil Gupta ©2017-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
class DoubleDimensionalArray
{
    static int arr[][]=new int[3][3];
    public void sum()
    {
        int sum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                sum=arr[i][j]+arr[i][j+1];
            }
        }
        System.out.println(sum);
    }
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        DoubleDimensionalArray obj =new DoubleDimensionalArray();
        System.out.println("Enter the numbers");
        
        DoubleDimensionalArray D=new DoubleDimensionalArray();
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        D.sum();
        /*for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
        }*/
        //call sum
    }
}