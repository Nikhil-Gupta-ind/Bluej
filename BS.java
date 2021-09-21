/**
 * Write a description of class BS here.
 * Binary Search Technique
 * @author Nikhil Gupta ©2017-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class BS
{
    public int search(int arr[],int val,int l)
    {
        /*for(int i=0;i<l;i++)
        {
            System.out.println(arr[i]+", ");
        }*/
        int iniI=0;
        int finI=l-1;
        int mid;
        for(int i=0;i<l-1;i++)
        {
            mid=(iniI+finI)/2;
            //System.out.println(arr[mid]);
            if(arr[mid]==val)
            {
                return mid;
            }
            else if(val>arr[mid])
            {
                iniI=mid+1;
            }
            else
            {
                finI=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int l=arr.length;
        System.out.println("Enter the value");
        int val=sc.nextInt();
        BS obj=new BS();
        //System.out.println("Length "+l);
        
        int index=obj.search(arr, val,l);
        //System.out.println(index);
        if(index==-1)
        {
            System.out.println("Not found");
        }
        else
        {
            System.out.println("The Value "+val+" is present at index number "+index);
            System.out.println("Position: "+ (index+1));
        }
    }
}