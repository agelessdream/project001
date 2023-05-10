package object_oriented.recurse;

public class RecurseTest {
    /**
     * 计算从left到right的所有整数之和
     *
     * @param left
     * @param right
     * @return
     */
    public int method1(int left, int right) {
        if (right == left) {
            return left;
        }
        return right + method1(left, right - 1);

    }

    /**
     * 计算n!
     *
     * @param n
     */
    public int method2(int n) {
        if (n == 1) {
            return 1;
        }
        return n * method2(n-1);
    }

    public static void main(String[] args) {
        RecurseTest recurse = new RecurseTest();
        System.out.println(recurse.method1(1, 10000));
        System.out.println(recurse.method2(5));
    }
}
