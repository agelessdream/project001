package abstracttest;

public class MyDate {
    private int year,month,day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }


    public String toDateString() {
        return year+"年"+month+"月"+day+"日";
    }
}
