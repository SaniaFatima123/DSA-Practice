package code;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
         int[] arr = {2,3,1,6,4};
         selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr){
        for(int i = 0;i <arr.length; i++){
            //find the max item in the remaining array and swap with the correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr, maxIndex, last);
        }
    }
    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i=start; i<=end; i++){
           if(arr[max]<arr[i]){
               max = i;
           }
        }
        return max;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
