import java.util.regex.*; // import function for REGEX
/**
 * Source code for course Object-oriented Programming
 * this code refer to  JBank phase 1 table(UML)
 * @author (Riansyah Sumajaya/1306447436) 
 * @version (27-02-2016)
 */
public class Customer
/**
 * Fungsi Class Customer : konfigurasi data Customer contohnya nama,alamat, dan nomor telepon.
 */
{
    private String cityName,dateOfBirth,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode;
    private int custId,numberOfCurrentAccounts;
    private Account accounts = new Account();
    private Matcher matcher;
    private Pattern pattern;
    private static final String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+
    "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    /**
    * Constructor method for Customer
    */ 
    public Customer()
    {
    }
    /**
    * Constructor method for Customer
    * @param firstname untuk nama depan customer    
    * @param lastname untuk nama akhir customer
    */ 
    public Customer(String fname, String lname) 
    {
        this(fname,lname,null);
    }
    /**
    * Constructor method for Customer
    * @param firstname untuk nama depan customer
    * @param lastname untuk nama akhir customer
    * @param dateofbirth untuk tanggal lahir customer    
    * @param custId untuk ID Customer
    */
    public Customer(String firstName, String lastName, String dateOfBirth)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.dateOfBirth=dateOfBirth;
        custId=Bank.nextCustID;
    }
    /**
    * Accessor Method for getAddress
    * @return Alamat,Kota,dan kode pos yang telah di setting 
     */
    public String getAddress() 
    {
        return streetAddress + "," + cityName + "," + zipOrPostalCode; //megembalikan nilai ke var tsb
    }
    /**
    * Accessor method for getAccount
    * @return nama account dari data Customer yang telah di setting
    */
    public Account getAccount() 
    {
        return accounts; // mengembalikan nilai ke var disamping
    }
    /**
    * Accessor Method for getCustomerId
    * @return nomor ID dari data Customer yang telah di setting
    */
    public int getCustomerId() 
    {
        return custId; // mengembalikan nilai ke var disamping
    }
    /**
    * Accessor Method for getEmail
    * @return email dari data Customer yang telah di setting
    */
    public String getEmail() 
    {
        return email; // mengembalikan nilai ke var disamping
    }
    /**
    * Accessor Method for getCustomerName
    * @return nama awal dan nama akhir dari data Customer yang telah di setting
    */
    public String getName() 
    {
        return lastName + "," + firstName; // mengembalikan nilai ke var disamping
    }
    /**
    * Accessor Method for getNumOfAccounts
    * @return angka akun dari data customer yang telah di setting
    */
    public int getNumOfAccounts() 
    {
        return numberOfCurrentAccounts; // mengembalikan nilai ke var disamping
    }
        /**
    * Accessor Method for getPhoneNumber
    * @return nomor telepon dari data Customer yang telah di setting
    */
    public String getPhoneNumber() 
    {
        return phoneNumber; // mengembalikan nilai ke var disamping
    }
    /**
    * Mutator Method untuk setAddress , Method yang melakukan setting data alamat customer
    * @param street jalan data alamat customer
    * @param city kota data alamat customer
    * @param code kode pos data alamat customer
    */
    public void setAddress(String street, String city, String code) 
    {
        streetAddress = street;  // melakukan setting nilai ke var yang tertulis dikolom ini
        cityName = city;
        zipOrPostalCode = code;
    }
    /**
    * Mutator Method untuk setName , Method yang melakukan setting data email Customer
    * @param lname nama akhir customer
    * @param fname nama depan customer
    */
    public void setName(String lname, String cfname)
    {
        lastName = lname; // melakukan setting nilai ke var yang tertulis dikolom ini
        firstName = cfname;
    }
    /**
    * Mutator Method untuk setPhoneNumber , Method yang melakukan setting data nomor telepon Customer
    * @param phoneNum nomor telepon data customer
    */
    public void setPhoneNumber(String phoneNum) 
    {
        phoneNumber = phoneNum; // melakukan setting nilai ke var yang tertulis dikolom ini
    }
    /**
    * Mutator Method untuk setAccount , Method yang melakukan serring data nama akun Customer
    * @param name nama akun customer
    */    
    public void setAccount(Account accounts) 
    {
        this.accounts = accounts; // melakukan setting nilai ke var yang tertulis dikolom ini
    }
    /**
    * Mutator Method for setEmail , Method untuk melakukan setting data email Customer
    * @param email untuk email Customer
    */
    public boolean setEmail(String emailAddress) 
    {
        matcher = pattern.matcher(emailAddress);
        pattern = Pattern.compile(emailPattern);
        if (matcher.matches())
        {
            email = emailAddress; //melakukan setting email ke var emailAddress
            return true;
        }
        else 
        {
            return false;
        }
    }
 }