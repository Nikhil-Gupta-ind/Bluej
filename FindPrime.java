/**
 * Write a description of class FindPrime here.
 * 
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */

public class FindPrime
{
   public static void main(String args[])
   {
       int Prime[]=new int[100];
       int i,j;
       j=0;
       for(i=2;i<100;i++)
       {
           if(i%1==0&&i%i==0)
           {
               Prime[j]=i;
           }
           j++;
       }
       System.out.println("Prime numbers are");
       for(int k=0;k<100;k++)
       {
           System.out.println(Prime[k]);
       }
   }
}
