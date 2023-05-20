package inner;

public class Person {
    static class Dog{
        static void eat(){
            System.out.println("狗吃骨头");
        }
    }
    class Bird{
        static void fly(){
            System.out.println("鸟飞");
        }
    }
}
class Test2{
    public static void main(String[] args) {
        Person.Dog d=new Person.Dog();
        Person.Bird b=new Person().new Bird();
        Person.Dog.eat();
        Person.Bird.fly();
    }
}
