
/**
 * Write a description of class Savings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Savings extends Account
{
    protected double interestEarned;
    public Savings(Customer cust, double amount)
    {
        super();
        id = Integer.toString(cust.getCustomerId());
    }
    public boolean withdraw(double amount)
    {
        if (balance - amount >= 10) 
        {
            balance -= amount;
            return true;
        } 
        else 
        {
            return false;
        }
    }
    public void addDailyInterest(int numOfDays) 
    {
        double y, p;
        p = numOfDays / 365;
        y = futureValue(balance, 0.03, 360, p);
        interestEarned = y - balance;
        balance = y;
    }
    public double getInterestEarned() 
    {
        return interestEarned;
    }
}
