package questionbank.basic;
//5、求1+2！+3！+...+20！的和
public class Class5 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=20;i++){
            int product=1;
            for(int j=1;j<=i;j++){
                product*=j;
            }
            sum+=product;
        }
        System.out.println(sum);
    }
}
