package chapter02;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        System.out.println("请输入您的名字");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("您的名字是" + name);
    }
}
