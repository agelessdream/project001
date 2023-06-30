package test;


import java.awt.*;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "我";
        String s2 = "我";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        s1 = "aa";
        System.out.println(System.identityHashCode(s1));

        Label:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 5) break Label;
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
