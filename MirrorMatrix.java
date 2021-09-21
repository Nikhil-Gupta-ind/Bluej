/**
 * Write a description of class MirrorMatrix here.
 * 
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MirrorMatrix
{
    void print(int arr[][])
    {
       for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        } 
    }
    void printMirror(int arr[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=2;j>=0;j--)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        int arr[][]=new int[3][3];
        System.out.print("_");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        MirrorMatrix obj=new MirrorMatrix();
        obj.print(arr);
        System.out.println("");
        obj.printMirror(arr);
    }
}
