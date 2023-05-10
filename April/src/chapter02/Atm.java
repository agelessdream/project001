package chapter02;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        double banlance=0;
        Scanner scan=new Scanner(System.in);
        boolean b1=true;
        for(;b1;){
            System.out.println("======ATM======");
            System.out.println("    1.存款");
            System.out.println("    2.取款");
            System.out.println("    3.查询余额");
            System.out.println("    4.退出");
            System.out.println("请输入您需要的操作(1-4)");
            int selection= scan.nextInt();
            switch (selection){
                case 1:
                    System.out.println("您的当前余额为"+banlance+",请输入存款金额");
                    double a= scan.nextDouble();
                    if(a>0){
                        banlance+=a;
                        System.out.println("存款成功，您的当前余额为"+banlance);
                    }else {
                        System.out.println("少侠，您又调皮了");
                    }break;

                case 2:
                    System.out.println("您的当前余额为"+banlance+",请输入取款金额");
                    double b= scan.nextDouble();
                    if(b<=0){
                        System.out.println("少侠，您又调皮了");
                    }else if(b>banlance){
                        System.out.println("余额不足");
                    }else{
                        banlance-=b;
                        System.out.println("取款成功，您的当前余额为"+banlance);
                    }break;
                case 3:
                    System.out.println("您当前的余额为"+banlance);
                    break;
                case 4:
                    b1=false;
                    break;
                default:
                    System.out.println("少侠，您又调皮了");
            }

        }
        System.out.println("感谢使用，欢迎下次光临");
        scan.close();
    }
}
