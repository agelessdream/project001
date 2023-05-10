package object_oriented.phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1=new Phone();
        p1.name="huawei p40";
        p1.price=5000;

        Phone p2=new Phone() ;
        p2.name="honor";


        System.out.println(p1.name);
        System.out.println(p2.name);

        p1.sendMessage("哈哈哈");
    }
}
