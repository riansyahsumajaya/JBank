import java.util.*;
public final class Investment extends Savings 
{
    private int term;
    private double interestRate;
    private Date startDate, endDate;
    public Investment (Customer cust, double amount, int term)
    {
        super(cust, amount);
        this.term = term;
        int locTerm;
        Calendar cl = new GregorianCalendar();
        startDate = cl.getTime();
        if (term < 6) 
        {
            locTerm = 6;
        } 
        else 
        {
            locTerm = term;
        }
        cl.add(Calendar.MONTH, locTerm);
        endDate = cl.getTime();
        if (term <= 6) 
        {
            interestRate = 0.05;
        }
        else if (term > 6 && term <=12) 
        {
            interestRate = 0.06;
        } 
        else 
        {
            interestRate = 0.07;
        }
    }
    public void addDailyInterest(int numOfDays) 
    {
        double y, p;
        p = numOfDays / 365;
        y = futureValue(balance, interestRate, 360, p);
        interestEarned = y - balance;
        balance = y;
    }
    public boolean withdraw(double amount) 
    {
        if (balance - amount >= 100) 
        {
            if (Calendar.getInstance().before(endDate)) 
            {
                if ( (balance * 0.8) - amount >= 100 ) 
                {
                    balance *= 0.8;
                    balance -= amount;
                    return true;
                } 
                else 
                {
                    return false;
                }    
            } 
            else 
            {
                return false;
            }
        } 
        else 
        {
            return false;
        }
    }
}
