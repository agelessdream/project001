package test;
//interesting
public class ClassTest {
    static void print(A a){
        System.out.println(1);
    }
    static void print(B b){
        System.out.println(2);
    }


    public static void main(String[] args) {
//        print(new A());
//        print(new B());
//        A x=new B();
//        print(x);
    }
}
class A{

}
class B extends A{

}