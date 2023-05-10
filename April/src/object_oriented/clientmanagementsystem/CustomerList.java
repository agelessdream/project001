package object_oriented.clientmanagementsystem;

public class CustomerList {
    private Customer[] customers;
    private int amount;
    public CustomerList(int amount){
        customers=new Customer[amount];
    }
    public boolean addCustomer(Customer customer){
        if(amount<customers.length){
            customers[amount++]=customer;
            return true;
        }return false;

    }
    public boolean replaceCustomer(int index,Customer customer){
        if(index>=0&&index<amount){
            customers[index]=customer;
            return  true;
        }return false;
    }
    public boolean deleteCustomer(int index){
        if(index>=0&&index<amount){
            for(int i=index;i<customers.length-1;i++) {
                customers[index] = customers[index + 1];
            }
            customers[amount-1]=null;
            amount--;
            return  true;
        }return false;
    }
    public Customer[] getALLCustomers(){
        Customer[] realCustomers=new Customer[amount];
        for(int i=0;i<amount;i++){
            realCustomers[i]=customers[i];

        }return realCustomers;
    }
    public Customer getCustomer(int index){
        if(index>=0&&index<amount){

            return  customers[index];
        }return null;
    }

    public int getAmount() {
        return amount;
    }
}
