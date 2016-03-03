/**
 * source code for course object-oriented programming
 * this code refer to  JBank phase 1 table(UML)
 * @author (Riansyah Sumajaya/1306447436) 
 * @version (27-02-2016)
 */
public class Bank
/**
 * Bank Class : memanage segala transaksi
 */
{
    private static double creditInterestRate, investmentInterestRate,premiumInterestRate;
    public static int lastCustID, nextCustID, numOfCurrentCustomer;
    public static int maxNumOfCustomers = 20;
    private static String closeTime, phone, startTime;
    public static final String bankName= "JBANK", bankAddress = "1234 JavaStreet, AnyCity, ThisState, 34567";
    public static String website;
    /**
    * Constructor Method for Bank
    */
    public Bank() 
    {        
    }
    /**
    * Accessor Method for getAddress
    * @return kembali ke nilai "null"
    */
     /*public static String getAddress() 
    {
        return ""; //untuk mengembalikan nilai ke value null
    }
    */
    /**
    * Accessor Method for getCredit
    * @return kembali ke nilai "0"
    */
    public static double getCreditRate() 
    {
        return 0; //untuk mengembalikan nilai ke value 0
    }
    /**
    * Accessor Method for getInvestmentRate
    * @return kembali ke nilai "0"
    */
    public static double getInvestmentRate() 
    {
        return 0; //untuk mengembalikan nilai ke value 0
    }
    /**
    * Accessor Method for getHoursOfOperation
    * @return kembali ke nilai "null"
    */
    public static String getHoursOfOperation() 
    {
        return ""; //untuk mengembalikan nilai ke value null
    }
    /**
    * Accessor Method for getLastID
    * @return kembali ke nilai "0"
    */
    public static int getLastID() 
    {
        return 0; //untuk mengembalikan nilai ke value 0
    }
    /**
    * Accessor Method for getMaxCustomers
    * @return kembali ke nilai "0"
    */
   /*
    public static int getMaxCustomers() 
    {
        return 0; //untuk mengembalikan nilai ke value 0
    }
    */
    /**
    * Accessor Method for getName
    * @return kembali ke nilai "null"
    */ 
   /*public static String getName() 
    {
        return ""; //untuk mengembalikan nilai ke value null
    }
    */
    /**
     * Method Accessor getNextID
     * @return ke nomor customer ID selanjutnya
     */
    public static int getNextID() 
    {
        int var1, var2;
       if (nextCustID == 0)  
       {
            nextCustID = 1000;
            numOfCurrentCustomer += 1;
            var1=nextCustID;
            return var1;
        }
        else if (numOfCurrentCustomer == maxNumOfCustomers)
        {
            var1=0;
            return var1;
        }
        else 
        {
            lastCustID = nextCustID;
            nextCustID += 1;
            numOfCurrentCustomer += 1;
            var2 = nextCustID;
            return var2;
        }
    }
    /**
    * Accessor Method for getWebsite
    * @return kembali ke nilai "null"
    */
    public static String getWebsite() 
    {
        return ""; //untuk mengembalikan nilai ke value null
    }
    /**
    * Accessor Method for getPremiumRate
    * @return kembali ke nilai "0"
    */
    public static double getPremiumRate() 
    {
        return 0; //untuk mengembalikan nilai ke value 0
    }
    /**
    * Accessor Method for getPhone
    * @return kembali ke nilai "null"
    */
    public static String getPhone() 
    {
        return ""; //untuk mengembalikan nilai ke value null
    }
    /**
     * Accessor Method for getNumOfCurrentCustomers
     * @return jumlah user yang ada sampai saat ini
     */
    public static int getNumOfCurrentCustomers() {
        return numOfCurrentCustomer;
    }       
    /**
     * Method Mutator setCreditRate
     * @param rate bunga credit yang telah diatur oleh bank
     */
    public static void setCreditRate(double rate) 
    {
    }
    /**
     * Mutator Method for setInvestmentRate
     * @param rate investment yang telah diatur oleh bank
     */
    public static void setInvestmentRate(double rate) 
    {
    }
    /**
     * Mutator Method for setPremium
     * @param rate premium yang telah diatur oleh bank
     */
    public static void setPremium(double rate) 
    {
    }
}
