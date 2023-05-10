package object_oriented.recurse;

public class RecurseTest3 {
    /**
     * 斐波那契数列第一项为a，第二项为b，求第n项
     * @param a
     * @param b
     * @param c
     * @return
     */
    public int method(int a,int b,int c){
        if(c==1){
            return a;
        }else if(c==2){
            return b;
        }return method(a,b,c-1)+method(a,b,c-2);
    }

    public static void main(String[] args) {
        RecurseTest3 object=new RecurseTest3();
        System.out.println(object.method(1,1,6));
    }
}
