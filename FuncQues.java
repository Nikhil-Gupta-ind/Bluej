/**
 * Write a description of class FuncQues here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuncQues
{
    static char s[]={'J','U','N','E'};
    static void fun1(char s[],int x)
    {
        System.out.println(s);
        char temp=0;
        if(x<s.length/2)
        {
            temp=s[x];
        }
        s[x]=s[s.length-x-1];
        s[s.length-x-1]=temp;
        fun1(s,x+1);
    }
    void func2(String n)
    {
        char c[]=new char[n.length()];
        for(int i=0;i<c.length;i++)
        c[i]=n.charAt(i);fun1(c,0);
    }
    public static void main(String args[])
    {
        FuncQues obj=new FuncQues();
        fun1(s,x);
    }
}