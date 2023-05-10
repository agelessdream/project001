package object_oriented.constructor.bank;

public class Customer {
    private String firstName,lastName;
    private Account account;

    public Customer(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
