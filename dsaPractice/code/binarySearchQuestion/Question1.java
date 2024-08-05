package code.binarySearchQuestion;

public class Question1 {
    // search an element in a rotated sorted array

    public int searchTarget(int[] arr, int target){
        int answer = 0, left = 0, right = arr.length-1;
        int mid = 0;
        while(left<=right) {
             mid = left + (right - left) / 2;
            if(arr[mid]==target){
                return mid;
            }
            //if left array is sorted
             if(arr[left]<arr[mid]){
                 if(target>=arr[left] && target<arr[mid]){
                     right = mid-1;
                 }
                 else{
                     left = mid+1;
                 }
             }
             //if right array is sorted
             else{
                 if(target>arr[mid] && target<=arr[right]){
                     left = mid+1;
                 }
                 else{
                     right = mid-1;
                 }
             }

        }
        return mid;

    }


    public static void main(String[] args) {
        int[] arr = {5, 6, 0, 1, 2, 3, 4};
        int target = 3;
        Question1 obj = new Question1();
        System.out.println(obj.searchTarget(arr, target));

        int[] arr2 = {5, 6, 0, 1, 2, 3, 4};
        int target2 = 6;
        System.out.println(obj.searchTarget(arr2, target2));
    }


}
