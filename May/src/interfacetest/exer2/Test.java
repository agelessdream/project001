package interfacetest.exer2;

public class Test {
    public static void main(String[] args) {
        System.out.println(new ComparableCircle(5.1).compareTo(new Circle(3.2)));
        System.out.println(new Rectangle(5,3).compareTo(new Rectangle(3,5)));
    }
}
