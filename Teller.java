public class Teller
{
    private Customer c1 = new Customer();
    private Account a1 = new Account();
    private Account acct;
    private double saldo;
    private String namapanjang;
    public static void main(String[] args) 
    {
    }
    public Teller()
    {
        c1.setName("Sutandi","Sanadhi");
        a1.setBalance(50000);
        c1.setAccount(a1);
        acct=c1.getAccount();
        saldo=acct.getBalance();
        namapanjang=c1.getName();
        System.out.println(namapanjang);
        System.out.println(saldo);
    }

}
