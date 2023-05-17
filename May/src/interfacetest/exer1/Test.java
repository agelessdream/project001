package interfacetest.exer1;

public class Test {
    public static void main(String[] args) {
        Eatable[] e1=new Eatable[]{new Chinese(),new American(),new India()};
        for(int i=0;i<e1.length;i++){
            e1[i].eat();
        }
    }
}
