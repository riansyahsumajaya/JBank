/**
 * source code for course object-oriented programming
 * this code refer to  JBank phase 1 table(UML)
 * @author (Riansyah Sumajaya/1306447436) 
 * @version (27-02-2016)
 */
public class Account
{
    private char acctType;
    private double balance;
    private String id;
    
    public Account() 
    {
    }
    public Account(char type, double amount) 
    {
    }
    private void deposit(double amount) 
    {
    }
    public char getAcctType() 
    {
        return acctType;
    }
    public double getBalance() 
    {
        return balance;
    }
    public String getId() 
    {
        return "id";
    }
    public void setBalance(double amount) 
    {
        balance = amount;
    }
    public void setID(String acctId) 
    {
        id = acctId;
    }
    public void setacctType(char type) 
    {
        acctType = type;
    }
    private void withdraw(double amount) 
    {
    }
}