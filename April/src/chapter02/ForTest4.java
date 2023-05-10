package chapter02;
//猜数
import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入下限a=");
        int a=scan.nextInt();
        System.out.println("请输入上限b=");
        int b=scan.nextInt();
        int random=(int)(Math.random()*(b-a+1)+a);
        int count=1;
        System.out.println("开始猜吧！");
        int guess=scan.nextInt();
        for(;guess!=random;count++){
            if(guess>random){
                System.out.println("你输入的数太大了");
            } else{
                System.out.println("你输入的数太小了");
                  }
            System.out.println("请重新猜");
            guess=scan.nextInt();
            }
        System.out.println("恭喜你猜对了，次数为"+count);
    }

}
