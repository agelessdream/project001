package object_oriented.person;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.assignAge(2);
        System.out.println(p1.showAge());
        p1.addAge(3);
        System.out.println(p1.showAge());
        p1.study("数学");

        Person p2 = new Person();
        p2.assignAge(10);
        System.out.println(p2.showAge());
        p2.addAge(5);
        System.out.println(p2.showAge());
        p2.study("java");
    }

}


