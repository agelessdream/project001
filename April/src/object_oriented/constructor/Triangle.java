package object_oriented.constructor;

public class Triangle {
    private double base,height;
    Triangle(double b,double h){
        base=b;
        height=h;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    public double getArea() {
        return base * height/2;
    }

    public static void main(String[] args) {
        Triangle t1=new Triangle(2,3);
        System.out.println(t1.getArea());
        t1.setBase(3);
        System.out.println(t1.getArea());
        t1.setHeight(4);
        System.out.println(t1.getArea());
    }
}
