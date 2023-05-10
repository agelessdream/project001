package object_oriented.person;

public class Person {
    String name;
    int age;
    char gender;

    public void study(String s) {
        System.out.println("我要好好学习"+s);
    }

    public void assignAge(int value) {
        age = value;
    }

    public int showAge() {
        return age;
    }

    public void addAge(int value) {
        age += value;
    }
}
