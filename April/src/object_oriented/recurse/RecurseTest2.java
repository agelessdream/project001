package object_oriented.recurse;

public class RecurseTest2 {
    /**
     * 递推数列满足f(m)=2f(m-1)-1，已知f(1)=a,求f(n)
     * @param a
     * @param n
     * @return
     */
    public int method(int a,int n){
        if(n==1){
            return a;
        }
           return 2*method(a,n-1)-1;
    }

    public static void main(String[] args) {
        RecurseTest2 object=new RecurseTest2();
        System.out.println(object.method(2, 3));
    }
}
