package abstracttest;

public class SalariedEmployee extends Employee {
    private int monthlySalary;

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, String number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }
    public SalariedEmployee(){

    }

    @Override
    public int earning() {
        return monthlySalary;
    }

    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }


}
