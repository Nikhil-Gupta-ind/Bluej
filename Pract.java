/**
 * Write a description of class Pract here.
 * 
 * @author Nikhil Gupta ©2018-21
 * @version 0.1
 */
import java.util.Scanner;
public class Pract
{
    public static void sortElement(int m,int n,int arr[][])
    {
        Pract obj=new Pract();
        int temp;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[i+1][j]>arr[i][j])
                {
                    temp=arr[i+1][j];
                    arr[i+1][j]=arr[i][j];
                    arr[i][j]=temp;
                }
            }
        }
        /*for(int i=0;i<m;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[i+1][j+1]>arr[i][j])
                {
                    temp=arr[i+1][j+1];
                    arr[i+1][j+1]=arr[i][j];
                    arr[i][j]=temp;
                }
            }
        }*/
        System.out.println("");
        obj.print(m,n,arr);
    }
    public void print(int m,int n,int A[][])
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("m=");
        int M=sc.nextInt();
        //System.out.println();
        System.out.print("n=");
        int N=sc.nextInt();
        
        int m=0,n=0;
        if((M>2&&M<20)&&(N>2&&N<20))
        {
            m=M;
            n=N;
        }
        else
        {
            System.out.println("Invalid");
        }
        int A[][]=new int[m][n];
        int temp;
        System.out.println("Enter the Matrix Values ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                temp=sc.nextInt();
                if(temp>0)
                {
                    A[i][j]=temp;
                }
            }
        }
        Pract obj=new Pract();
        obj.print(m,n,A);
        obj.sortElement(m,n,A);
    }
}
