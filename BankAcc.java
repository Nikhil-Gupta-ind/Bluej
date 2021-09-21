/**
 * Write a description of class BankAcc here.
 * 
 * @author Nikhil Gupta ©2018-21
 * @version (a version number or a date)
 */
public class BankAcc
{
    
    static String firstname,Surname,Address;
    static long balance;
    static int accNo;
    public BankAcc(String fn,String sn,String ad)
    {
        firstname=fn;
        Surname=sn;
        Address=ad;
        balance=1000;
        accNo=nextAccNo;
        ++nextAccNo;
    }
    public long getBalance()
    {
        return balance;
    }
    public void deposit(long amount)
    {
        balance=balance+amount; 
    }
    public void withdraw(long amount)
    {
        if((balance-amount)>1000)
        {
            balance=balance-amount;
        }
        else
        System.out.out.Println("Can't withdraw because balance would become <1000");
    }
    public void display()
    {
        System.out.out.Println("\nCustomer"+firstname+""+surname);
        System.out.out.Println("Accuont number ="+accNo);
        System.out.out.Println("Account balance ="+(balance/100.0));
    }
}

public class SavingAcc extends BankAcc
{
    private double Rate;
    public void addInterest(int word);
}