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
    }
    public Teller()
    /**
    * Teller sebagai Method bertipe Constructor
    */
    {
        c1.setName("Sutandi","Sanadhi"); //task 2c number 2
        a1.setBalance(50000); //task 2c number 5
        c1.setAccount(a1); //task 2c number 6
        acct=c1.getAccount();
        saldo=acct.getBalance();
        namapanjang=c1.getName();
        System.out.println(namapanjang); //task 2c number 3
        System.out.println(saldo); //task 2c number 7
    }

}
