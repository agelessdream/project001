package object_oriented.constructor.bank;

public class Test {
    public static void main(String[] args) {
        Customer customer1=new Customer("Jane","Smith");
        Account account1=new Account(1000,2000,0.0123);
        customer1.setAccount(account1);
        //customer1.setAccount(new Account(1000,20000,0.0123));

        System.out.println(customer1.getAccount().getBalance());
        System.out.println(customer1.getAccount().deposit(-100));
        System.out.println(customer1.getAccount().deposit(100));
        System.out.println(customer1.getAccount().withdraw(3000));
        System.out.println(customer1.getAccount().withdraw(1000));
    }
}
