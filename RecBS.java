/**
 * Write a description of class RecBS here.
 * Binary Search using recursive
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RecBS
{
    public int search(int iniI, int finI,int mid, int arr[], int val)
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
            //System.out.println(val);
            return search(iniI, finI, mid, arr, val);
        }
        else if(val<arr[mid])
        {
            finI=mid-1;
            return search(iniI, finI, mid, arr, val);
        }
        else
        return -1;
    }
    public static void main(String args[])
    {
        RecBS obj = new RecBS();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter value");
        int val=sc.nextInt();
        
        int arr[]={10,20,30,40,50,60,70,80,90,100};
        int l=arr.length;
        
        int iniI=0;     //initial Index
        int finI=l-1;   //final Index
        int mid=0;
        //int mid=(ini+val)/2;
        int index=obj.search(iniI, finI, mid, arr, val);
        if(index==-1)
        {
            System.out.println("Not Found");
        }
        else
        {
            System.out.println("The value "+val+" is present at index no "+index);
            System.out.println("Position: "+(index+1));
        }
    }
}