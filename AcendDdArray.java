/**
 * Write a description of class AcendDDarray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class AcendDdArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values");
        int input[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                input[i][j]=sc.nextInt();
            }
        }
        int arr[]=new int[9]; int k=0;
        for(int m=0;m<3;m++)
        {
            for(int n=0;n<3;n++)
            {
                arr[k]=input[m][n];
                k++;
            }
        }
        //AcendDdArray obj=new AcendDdArray();
        //int result[]=obj.acend(arr[]);
        int temp;
        for(int a=0;a<arr.length-1;a++)
        {
            if(arr[a]>arr[a+1])
            {
                temp=arr[a];
                arr[a]=arr[a+1];
                arr[a+1]=temp;
            }  
        }
        
        int num[][]=new int[3][3];
        int b=0;
        for(int p=0;p<3;p++)
        {
            for(int q=0;q<3;q++)
            {
                num[p][q]=arr[b];
                b++;
            }
        }
        
        for(int p=0;p<3;p++)
        {
            for(int q=0;q<3;q++)
            {
                System.out.print(num[p][q]+" ");
            }
            System.out.println("");
        }
    }
    /*public static int acend(int num[])
    {
        
        return num;
    }*/
}
