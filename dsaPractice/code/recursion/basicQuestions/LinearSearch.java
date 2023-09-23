package code.recursion.basicQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,5,7,6,9};
        System.out.println(find(arr,0,6));
        System.out.println(findIndex(arr,0,6));
        System.out.println(findIndexFromLast(arr, arr.length-1, 6));
    }
    static boolean find(int[] arr,int index, int target){
        if(index == arr.length-1){
            return false;
        }
        return arr[index]==target || find(arr, index+1,target);
    }
    static int findIndex(int[] arr, int index, int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr, index + 1, target);
        }
    }
    static int findIndexFromLast(int[] arr, int index, int target){
        if(index == -1){
            return -1;
        }
         if(arr[index] == target){
            return index;
        }
        else {
            return findIndexFromLast(arr, index - 1, target);
        }
    }

}
