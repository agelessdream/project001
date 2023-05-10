package array;
//数组定义后长度不可变？
public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,2,3};
        int[] arr2=new int[3];
        arr2=arr1;
        arr1[0]=5;
        System.out.println(arr2[0]);

    }
}
