package equals.order;

import java.util.Objects;

public class Order {
    private int orderid;
    private String orderName;

    public Order(int orderid, String orderName) {
        this.orderid = orderid;
        this.orderName = orderName;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderid == order.orderid && Objects.equals(orderName, order.orderName);
    }


}
