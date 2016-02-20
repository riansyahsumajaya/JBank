
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    private String cityAddress,dateOfBirth,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode;
    private int custId,numberOfCurrentAccounts;
    private Account accounts = new Account();
    public Customer()
    {
    }
    public Customer(String fname, String lname, String dob) 
    {
    }
    public Customer(String firstName, String lastName, String dateOfBirth, int custId)
    {
    }
    private String getAddress() 
    {
        return "";
    }
    public Account getAccount() 
    {
        return accounts;
    }
    private int getCustomerId() 
    {
        return 0;
    }
    private String getEmail() 
    {
        return "";
    }
    private String getCustomerName() 
    {
        return "";
    }
    public int getNumOfAccounts() 
    {
        return 0;
    }
    private String getPhoneNumber() 
    {
        return "";
    }
    private void setAddress(String street, String city, String code) 
    {
        return;
    }
    private void setEmail(String emailAddress) 
    {
        return;
    }
    private void setCustomerName(String lname, String cfname) 
    {
        return;
    }
    private void setPhoneNumber(String phoneNum) 
    {
        return;
    }
}