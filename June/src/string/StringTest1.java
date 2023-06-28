package string;

public class StringTest1 {
    public static void main(String[] args) {
        int num = 5;
        Integer num2 = 5;
        String s1 = String.valueOf(num);
        String s2 = num2.toString();
        String s3 = String.valueOf(num2);
        System.out.println(s2.equals(s3));
        System.out.println("abc".toCharArray());
        System.out.println();
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("a".compareTo("c"));
        System.out.println("  a b    ".trim());
        System.out.println("innermusi c".contains("i "));
    }
}
