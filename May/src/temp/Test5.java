package temp;
//为一个对象单独重写一个方法
public class Test5 {
    void m(){
        System.out.println("111");
    }
    public static Test5 t1=new Test5(){
        void m(){
            System.out.println("333");
        }
    };

}
class Test2{
    public static void main(String[] args) {
        new Test5(){
            void m(){
                System.out.println("222");
            }
        }.m();


        Test5.t1.m();
    }
}
