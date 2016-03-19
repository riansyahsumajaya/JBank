import java.util.Date;
import java.util.Locale;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.math.*;
import java.sql.Time;
/**
 * source code for course object-oriented programming
 * this code refer to  JBank phase 1 table(UML)
 * @author (Riansyah Sumajaya/1306447436) 
 * @version (27-02-2016)
 */
  
public class Teller
/**
* Fungsi utama Teller : membuat objek baru berisi tipe akun dan data customer serta menampilkan balancenya
*/
{   
    private Customer c1 = new Customer(); // task 2c number 1
    private Account a1 = new Account(); //task 2c number 4
    private Account acct;
    private double saldo;
    private String namapanjang;
     /** 
     * @param args Arguments
     */
    public static void main(String[] args)
    {
        Bank.getHoursOfOperation();
    }
     /*public static void main(String[] args) 
    {
      int balance,year,month,day;
      char acctType;
      String input = "",fname,lname,phone;
      String input1 = "yyyy-MM-dd",Date;
      Scanner sc = new Scanner(System.in);
      Customer customers;
      
      do {
          System.out.println("New Costumer? (Y/N)");
          input = sc.next();
        if ( input.equals("Y")) 
        {
            acctType = '\0';
            System.out.print("First Name: ");
            input = sc.next();
            fname = input;
            System.out.print("Last Name: ");
            input = sc.next();
            lname = input;
            System.out.print("Date of Birth (ex: 1996-03-04): ");
            year = sc.nextInt();
            month = sc.nextInt();
            day = sc.nextInt();
            Date = input1;
            System.out.print("Telephone: ");
            input = sc.next();
            phone = input;   
            customers = new Customer(fname,lname,(new GregorianCalendar(year,month,day).getTime()));
            customers.setPhoneNumber(phone);               
            System.out.println("S: Savings; O: Overdraft; I:Investment; L: Credit Checking; NC: Not Created ");
            System.out.print("Account Type (S/O/I/L/NC): ");
            input = sc.next();
              if (input.equals("NC")) 
              {                 
              } 
              else 
              {
                  acctType = input.charAt(0);
                  do 
                  {
                    System.out.print("New Balance: ");
                    input = sc.next();
                    balance = Integer.parseInt(input);
                    if (balance<=0) 
                    {
                        System.out.println("Wrong Input");
                    } else 
                    {
                        break;
                    }
                  } 
                  while(true);
                  if (customers != null) 
                  {
                  customers.setAccount(new Account(acctType,balance));
                  customers.getAccount().setID(String.valueOf(customers.getCustomerId() ) + acctType);
                  }
              }
              System.out.println("Customer Information");
              System.out.println(customers);
            if (acctType != '\0')
            System.out.print(customers.getAccount());
            } 
            else if (input.equals("N")) 
            {
             System.out.println("Thank you and see you again!"); 
             break;
            } else {
            System.out.println("Use only Y or N \n");
        }
      } 
      while(true);
    } */
    public Teller()
    /**
    * Teller sebagai Method bertipe Constructor
    */
    {
        /*
       c1.setName("Sutandi","Sanadhi"); //task 2c number 2
        a1.setBalance(50000); //task 2c number 5
        c1.setAccount(a1); //task 2c number 6
        acct=c1.getAccount();
        saldo=acct.getBalance();
        namapanjang=c1.getName();
        System.out.println(namapanjang); //task 2c number 3
        System.out.println(saldo); //task 2c number 7
        */
    }
}
