package abstracttest;

public abstract class Employee {
    private String name,number;
    private MyDate birthday;
    public abstract int earning();

    public Employee() {
    }

    public Employee(String name, String number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
    public String toString(){
        return "name = " + name + ",number = " + number +
                ", birthday = " + birthday.toDateString();
    }
}
