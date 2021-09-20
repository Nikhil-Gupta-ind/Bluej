//this program finds the wovel in each word and prints the rest of word followed by the wovel alphabet from begning
import java.util.Scanner;
class Simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String str1=sc.nextLine();
        String str2[]=str1.split(" ");
        char a='a';
        String temp="",temp2="";
        for(int j=0;j<=str2.length;j++)
        {
            String str=" ";
            str=str2[j];
            str.trim();
            for(int i=0;i<str.length()-1;i++)
            {
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                {
                    a=str.charAt(i);
                    temp=str.substring(0,i).trim();
                    temp2=str.substring(i+1,str.length());
                    System.out.println(temp2+temp+a);
                    break;
                }
            }
            
        }
    }
}

            
