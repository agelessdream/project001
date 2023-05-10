package object_oriented.tool;

public class ArrayTool {
    /**
     * 求数组的最大值
     *
     * @param arr
     * @return
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 求数组的最小值
     *
     * @param arr
     * @return
     */
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 求数组的和
     *
     * @param arr
     * @return
     */
    public int getSum(int[] arr) {
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    /**
     * 求数组的均值
     *
     * @param arr
     * @return
     */
    public double getAverage(int[] arr) {

        return getSum(arr) / (double) arr.length;
    }

    /**
     * 遍历数组
     *
     * @param arr
     */
    public void print(int[] arr) {
        System.out.print("[" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print("," + arr[i]);
        }
        System.out.print("]");
    }

    /**
     * 将arr1赋值给arr2
     *
     * @param arr1
     * @param arr2
     */
    public void copy(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

    }

    /**
     * 反转数组
     */
    public void reverse(int[] arr) {
        for (int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }

    }

    /**
     * 线性查找,只要找到一个，就输出它的下标，找不到则输出-1
     */
    public int linearSearch(int[] arr, int target) {
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }

        return index;

    }

    /**
     * 二分查找,只要找到一个，就输出它的下标，找不到则输出-1
     */
    public int binarySearch(int[] arr, int target) {
        int index=-1,left=0,right=arr.length-1;
        bubbleSort(arr);
        for(;left<=right;) {
            if(arr[(left+right)/2]==target){
                index=(left+right)/2;
                break;
            }else if(arr[(left+right)/2]<target){
                left=(left+right)/2+1;
            }else right=(left+right)/2-1;

        }
        return index;

    }

    /**
     * 冒泡排序
     */
    public void bubbleSort(int[] arr) {
        for(int i= arr.length-1;i>0;i--){
            boolean flag=true;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;//只要发生了交换，就改为false
                }

            }
            if(flag){
                break;//若一轮下来还是true，则这一轮没有发生交换，说明已经排好序，于是结束外层循环
            }
        }

    }

    /**
     * 选择排序
     * @param arr
     */
    public void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min=arr[i],index=i; //index用来存放最小元素的下标
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                    min=arr[j];
                    index=j;
                }
            }
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;

        }
    }

    /**
     * 插入排序
     * @param arr
     */
    public void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int index=i;//index用来存放第i个元素的实时的下标
            for(int j=i-1;j>=0;j--){

                if(arr[index]<arr[j]){
                    int temp=arr[index];
                    arr[index]=arr[j];
                    arr[j]=temp;
                    index=j;//交换位置后，index更新为新位置的下标
                }
                else break;//若已经比排好的部分中某一个数大了，则无需再比较这个数的左边的数了
            }

        }
    }
}
