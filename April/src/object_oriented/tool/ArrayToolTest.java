package object_oriented.tool;

public class ArrayToolTest {
    public static void main(String[] args) {
        ArrayTool tool1=new ArrayTool();
        int[] arr22=new int[]{7,2,5,1,3,-20,7,10,9,8};
        System.out.println(tool1.getMax(arr22));
        System.out.println(tool1.getMin(arr22));
        System.out.println(tool1.getSum(arr22));
        System.out.println(tool1.getAverage(arr22));
        tool1.insertionSort(arr22);
        tool1.print(arr22);
    }
}
