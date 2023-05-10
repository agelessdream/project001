package object_oriented.valuetransfertest;

public class ValueTransferTest1 {
    public static void main(String[] args) {
        ValueTransferTest1 object=new ValueTransferTest1();
        object.age=10;
        ValueTransferTest1 test=new ValueTransferTest1();
        test.update(object);
        System.out.println(object.age);


    }
    int age;
    public void update(ValueTransferTest1 object1){
        object1.age+=1;
    }
}
