package extend;

public class Person {
     int age;
     String name;
     String phoneNumber;

    public Person() {
        System.out.println("嘿嘿");
    }

    public Person(String name){
         this.name=name;
     }
    public Person(String name,int age){
        this(name);
        this.age=age;
    }
    public Person(int age, String name, String phoneNumber) {
        this(name,age);
        this.phoneNumber = phoneNumber;
    }

    public void eat(){
        System.out.println("人要吃饭");
    }
}
