package interfacetest.exer2;

public class ComparableCircle extends Circle implements CompareObject {
    public ComparableCircle(double radius) {
        super(radius);
    }

    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Circle) {
            if (getRadius() < ((Circle) o).getRadius()) {
                return -1;
            } else if (getRadius() > ((Circle) o).getRadius()) {
                return 1;
            } else return 0;
        } else return 99999;
    }


}
