class FibonacciSeries
{
    public static void main(String args[])
    {
        int a=0;
        int b=1;
        int sum,temp;
        System.out.print(a+","+b+",");
        for(int i=1;i<=100;i++)
        {
            sum=a+b;
            if(sum<=100&&sum>-1)
            {
                 System.out.print(sum+",");
            }
            temp=a;
            a=b;
            b=sum;
        }
    }
}