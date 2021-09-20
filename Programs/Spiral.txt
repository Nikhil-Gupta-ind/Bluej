/**
 * Write a description of class Spiral here.
 * A Programm to print the Matrix contaning the accending in a Spiral
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Spiral
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values to display the form of a Spiral");
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        Spiral S=new Spiral();
        S.spiral(a);
    }
    public void spiral(int arr[][])
    {
        System.out.println("");
        for(int i=0;i<9;i++)
        {
            
        
        for(int j=0;j<3;j++)
        {
            System.out.print(arr[0][j]+" ");
        }
    }
        /*//to print normally
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.println(arr[i][j]);
            }
        }*/
    }
}
