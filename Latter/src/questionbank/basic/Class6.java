package questionbank.basic;
//6、输出一个如下图形，一共有n行，第n行有2n-1个*，完成方法public void printStar(int n)的方法体
//    *
//   ***
//  *****
// *******
//*********
public class Class6 {
    public static void printStar(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printStar(5);
    }
}
