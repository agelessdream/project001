package object_oriented.thistest.bank;

public class Test {
    public static void main(String[] args) {
        Bank abc=new Bank();
        abc.addCustomer("张","三");
        abc.addCustomer("李","四");
        abc.getCustomers(0).setAccount(new Account(2000.0));
        abc.getCustomers(1).setAccount(new Account(1990.0));
        abc.getCustomers(0).getAccount().withdraw(200);
        abc.getCustomers(0).getAccount().deposit(200);
        System.out.println(abc.getCustomers(0).getAccount().getBalance());
        System.out.println(abc.getCustomers(1).getAccount().getBalance());
    }
}
