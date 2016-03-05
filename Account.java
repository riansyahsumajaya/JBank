/**
 * source code for course object-oriented programming
 * this code refer to  JBank phase 1 table(UML)
 * @author (Riansyah Sumajaya/1306447436) 
 * @version (27-02-2016)
 */
public class Account
/**
 * Account Class : memanage isi akun customer
 */
{
    private char acctType;
    private double balance;
    private String id;
    
    /**
    * Constructor Method for Account
    */
    public Account() 
    {
        acctType='S';
        balance=10.00;
    }
    /**
    * Constructor Method for Account
    * @param type untuk tipe akun
    * @param amount untuk jumlah saldo
    */
    public Account(char type, double amount) 
    {
        acctType=type;
        balance=amount;
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
    * Accessor Method for getAcctType
    * @return tipe akun customer
    */    
    public char getAcctType() 
    {
        return acctType;
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
    * Mutator Method for setId
    * @param acctId id akun customer
    */      
    public void setID(String acctId) 
    {
        id = acctId; // melakukan setting id customer
    }
    /**
    * Mutator Method for setacctType 
    * @param acctType tipe akun customer
    */  
    public void setacctType(char type) 
    {
        acctType = type; // melakukan setting tipe akun customer
    } 
    /**
    * Mutator Method for withdraw
    * @param amount jumlah saldo customer
    */      
    public boolean withdraw(double amount) 
    {
       //Mutator agar customer dapat mengambil saldo miliknya
        if (balance-amount < 0)
        {
            return false;
        }
        else
        {
            balance = balance - amount;
            return true;
        }  
    }
    public String toString()
    {
        System.out.println("Id      :   " + id);
        System.out.println("Tipe    :   " + acctType);
        System.out.println("Saldo   :   " + balance);
        return "";        
    }
        
}