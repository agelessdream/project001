package object_oriented.thistest.bank;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
    public Bank(){
        customers=new Customer[10];
    }
    public void addCustomer(String firstName,String lastName){
        customers[numberOfCustomer++]=new Customer(firstName,lastName);
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomers(int index) {
        if(index<0||index>=numberOfCustomer){
            return null;
        }
        return customers[index];
    }
}
