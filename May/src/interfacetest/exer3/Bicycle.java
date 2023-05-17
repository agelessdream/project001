package interfacetest.exer3;


public class Bicycle extends Vehicle {
    public void run() {
        System.out.println("人骑自行车");
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }
}
