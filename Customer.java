
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    private String cityName,dateOfBirth,email,firstName,lastName,streetAddress,phoneNumber,zipOrPostalCode;
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
    public String getAddress() 
    {
        return streetAddress + "," + cityName + "," + zipOrPostalCode;
    }
    public Account getAccount() 
    {
        return accounts;
    }
    public int getCustomerId() 
    {
        return custId;
    }
    public String getEmail() 
    {
        return email;
    }
    public String getName() 
    {
        return lastName + "," + firstName;
    }
    public int getNumOfAccounts() 
    {
        return numberOfCurrentAccounts;
    }
    public String getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setAddress(String street, String city, String code) 
    {
        streetAddress = street; 
        cityName = city;
        zipOrPostalCode = code;
    }
    public void setEmail(String emailAddress) 
    {
        email = emailAddress;
    }
    public void setName(String lname, String cfname) 
    {
        lastName = lname;
        firstName = cfname;
    }
    public void setPhoneNumber(String phoneNum) 
    {
        phoneNumber = phoneNum;
    }
    public void setAccount(Account accounts) 
    {
        this.accounts = accounts;
    }
}