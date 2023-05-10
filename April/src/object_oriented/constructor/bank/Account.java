package object_oriented.constructor.bank;

public class Account {
    private int id;
    private double balance, annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public String withdraw(double amount){
        if(amount<=0){
            return "你在逗我？";
        } else if (amount>balance) {
            return "余额不足";
        }else {
            balance=balance-amount;
            return "取款成功，当前余额为"+balance;
        }
    }
    public String deposit(double amount){
        if(amount<=0){
            return "你在逗我？";
        } else{
            balance=balance-amount;
            return "存款成功，当前余额为"+balance;
        }
    }
}