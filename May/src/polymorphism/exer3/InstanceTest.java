package polymorphism.exer3;

public class InstanceTest {
    public void method(Person e) {
        e.getInfo();
        if (e instanceof Graduate) {
            System.out.println("a graduated student");
        }

        if (e instanceof Student) {
            System.out.println("a student");
        }

        if (e instanceof Person) {
            System.out.println("a person");
        }
    }

    public static void main(String[] args) {

        InstanceTest test = new InstanceTest();

        test.method(new Student());

    }

}
