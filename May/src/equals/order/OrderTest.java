package equals.order;

public class OrderTest {


    public static void main(String[] args) {
        Order order1 = new Order(33, "哈哈");
        Order order2 = new Order(44, "嘿嘿");
        Order order3 = new Order(44, "嘿嘿");
        System.out.println(order1.equals(order2));
        System.out.println(order3.equals(order2));
    }
}
