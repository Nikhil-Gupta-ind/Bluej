//Programm to find the highest number of vowel in the word in a sentemce
import java.util.Scanner;
class NoVowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String Input=sc.nextLine();
        String Words[]=Input.split(" ");
        int l=Words.length;
        int a;//it will store the no of vowels
        int hnv[]=new int[Input.length()];
        for(int i=0;i<l;i++)//l=length of the array Words
        {
            String str=Words[i];
            a=0;
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)=='a'||str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u')
                {
                    a++;
                    hnv[i]=a;
                }
            }
            System.out.println("word no." +(i+1)+":" + a);
        }
        /*for (int k=0;k<hnv.length;k++)
        {
            System.out.println(hnv[k]);
        }*/
        int temp;
        int k;
        for(k=0;k<hnv.length-1;k++)
        {
            if(hnv[k+1]>hnv[k])
            {
                temp=hnv[k];
                hnv[k]=hnv[k+1];
                hnv[k+1]=temp;
            }
        }
        System.out.println("The highest number of vowel is in the word is "+hnv[1]);
    }
}