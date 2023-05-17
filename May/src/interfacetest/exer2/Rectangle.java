package interfacetest.exer2;

public class Rectangle implements CompareObject{
    private double length,width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override//将比大小方法直接写入这个类中，无需再搞一个类
    public int compareTo(Object o) {
        if (o == this) {
            return 0;
        }
        if (o instanceof Rectangle) {
            if (length*width < ((Rectangle) o).length*((Rectangle) o).width) {
                return -1;
            } else if (length*width > ((Rectangle) o).length*((Rectangle) o).width) {
                return 1;
            } else return 0;
        } else return 99999;
    }

}
