package questionbank.basic;
//1、用循环控制语句打印输出：1+3+5+...+99=?的结果
public class Class1 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <100 ; i+=2) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
