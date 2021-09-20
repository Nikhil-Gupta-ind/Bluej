/**
 * Write a description of class RecFibb here.
 * Write a recursive function for printing fibbonacci series upto 10 terms.
 * @author Nikhil
 * @version 2.0
 */
public class RecFibb
{
    int fibo(int n)
    {
        if(n==1)
            return 0;
        
        else if(n==2)
            return 1;
        else if(n>2)
            return fibo(n-1)+fibo(n-2);
        else
            return -1;
    }
    public static void main(String args[])
    {
        int i,term;
        RecFibb obj =new RecFibb();
        for(i=1;i<=10;++i)
        {
            term=obj.fibo(i);
            System.out.print(term+" ");
        }
    }
}