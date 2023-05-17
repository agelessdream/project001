package abstracttest;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[20];
        employees[0] = new SalariedEmployee("张三", "1", new MyDate(1995, 3, 2), 8500);
        employees[1] = new SalariedEmployee("李四", "2", new MyDate(1996, 4, 3), 8500);
        employees[2] = new HourlyEmployee("王五", "3", new MyDate(1997, 5, 4), 200, 400);
        for (int i = 0; i < 3; i++) {
            System.out.println(employees[i].getClass());
            System.out.println(employees[i].toString());

        }
    }

}
