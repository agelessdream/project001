package object_oriented.phone;

public class ObjectArrayTest {
    int age;

    public ObjectArrayTest(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        ObjectArrayTest[] a=new ObjectArrayTest[10];
        ObjectArrayTest o1=new ObjectArrayTest(10);
        ObjectArrayTest o2=new ObjectArrayTest(20);
        a[0]=o1;
        a[1]=o2;
        System.out.println(o1.age);
        System.out.println(a[0].age);
    }
}
