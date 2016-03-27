import java.math.BigDecimal;
import java.lang.Math;
import java.math.MathContext;
/**
 * source code for course object-oriented programming
 * this code refer to  JBank phase 1 table(UML)
 * @author (Riansyah Sumajaya/1306447436) 
 * @version (27-02-2016)
 */
public abstract class Account
/**
 * Account Class : memanage isi akun customer
 */
{
    protected double balance;
    protected String id;
    
    /**
    * Constructor Method for Account
    */
    public Account() 
    {
    }

    /**
    * Mutator Method for deposit
    * @param amount untuk jumlah saldo
    */    
    public boolean deposit(double amount) 
    {
        if (amount < 0)
        {
            return false;
        }
        else
        {
            balance = balance + amount; //memodifikasi var balance sehingga balance ditambah amount akan menambah isi saldonya
            return true;
        }  
    }

    /**
    * Accessor Method for getBalance
    * @return saldo akun customer
    */       
    public double getBalance() 
    {
        return balance;
    }
    /**
    * Accessor Method for getId
    * @return Id akun customer
    */     
    public String getId() 
    {
        return "id";
    }
    /**
    * Mutator Method for setBalance 
    * @param amount jumlah saldo customer
    */    
    public void setBalance(double amount) 
    {
        balance = amount; //melakukan setting balance saldo customer
    } 
    /**
    * Mutator Method for withdraw
    * @param amount jumlah saldo customer
    */      
    public abstract boolean withdraw(double amount);
    public String toString()
    {
        return "id";        
    }
    protected static double futureValue(double balance, double rate, double compound, double period) {
        MathContext mc = new MathContext(3);
        BigDecimal bal = new BigDecimal (balance);
        BigDecimal r = new BigDecimal (rate);
        BigDecimal n = new BigDecimal (compound);
        BigDecimal t = new BigDecimal (period);
        BigDecimal f1 = r.divide(n, mc.DECIMAL32).add(new BigDecimal(1));
        BigDecimal f2 = n.multiply(t, mc.DECIMAL32);
        BigDecimal f3 = new BigDecimal (Math.pow(f1.doubleValue(), f2.doubleValue()),mc.DECIMAL32);
        BigDecimal f4 = f3.multiply(bal, mc.DECIMAL32);
        return f4.doubleValue();
    }    
}