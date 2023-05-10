package tostring;

public class Test {
    public static void main(String[] args) {
        Circle circle1=new Circle("green",4.3);
        Circle circle2=new Circle("red",4.3);
        System.out.println(circle1.getColor().equals(circle2.getColor()));
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.toString());
    }
}
