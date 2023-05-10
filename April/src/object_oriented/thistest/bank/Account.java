package object_oriented.thistest.bank;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double amt){
        if(amt<=0){
            System.out.println("你在逗我？");
        }else {
            balance+=amt;
            System.out.println("成功存入"+amt+"，当前余额为"+balance);
        }
    }
    public void withdraw(double amt){
        if(amt<=0){
            System.out.println("你在逗我？");
        }else if(amt>balance){
            System.out.println("余额不足");
        }else {
            balance-=amt;
            System.out.println("成功取出"+amt+"，当前余额为"+balance);
        }
    }

}
