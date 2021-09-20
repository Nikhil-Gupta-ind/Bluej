/**
 * Write a description of class DMat here.
 * This programm finds row and column number of the smallest value present in the Matrix 
 * @author Nikhil Gupta
 * @version beta 1.0
 */
import java.util.Scanner;
public class DMat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int Darr[][]=new int [3][3];
        System.out.println("Enter the values of the Matrix");
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<=i;j++)
            {
                Darr[i][j]=sc.nextInt();
            }
        }
        /*//for printing the values of matrix (just to check)
        for(int k=0;k<3;k++)
        {
            for(int l=0;l<=k;l++)
            {
                
                System.out.println(Darr[k][l]);
            }
        }*/
        int SmallV,temp=0;
        int row, column;//row=m,column=n
        for(int m=0;m<3;m++)
        {
            for(int n=0;n<=m;n++)
            {
                if(Darr[m][n]<Darr[m][n+1]||Darr[m][n]<Darr[m+1][n])//out of bound exception
                {
                    SmallV=Darr[m][n];
                    System.out.println(SmallV);
                }
                else
                {
                    SmallV=temp;
                    SmallV=Darr[m][n+1];
                    System.out.println(SmallV);
                }
            }
        }
        /*System.out.println("Row :"+row);
        System.out.println("Column :"+column);*/
    }
}