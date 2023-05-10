package chapter02;

//输出1-100所有偶数，并计算数量，并求和
public class ForTest {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
                num++;
                System.out.print(i + "\t");
            }

        }
        System.out.println("\n" + sum + "\t" + num);
    }
}
