package questionbank.basic;

import java.util.Arrays;

//冒泡
public class Class2 {
    static void bubbleSort(int arr[]){
        for(int i=arr.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={5,7,3,9,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
