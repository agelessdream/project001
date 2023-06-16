package questionbank.basic;

public class Class4 {
    public static long f(int n){
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(f(100));
    }
}
