package chapter02;
//两个数的最大公因数，最小公倍数
import java.util.Scanner;

public class ForTest3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=scan.nextInt();
        System.out.println("请输入第二个数");
        int b=scan.nextInt();
        int c=(a<b)?a:b;
        for(;c>0;c--){
            if(a%c==0&&b%c==0){
                System.out.println("最大公因数是"+c);
                System.out.println("最小公倍数是"+a*b/c);
                break;
            }
        }
    }
}
