package test;


public class StringTest {
    public static void main(String[] args) {
        String s1="我";
        String s2="我";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        s1="aa";
        System.out.println(System.identityHashCode(s1));

    }
}
