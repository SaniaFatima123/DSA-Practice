package code.binarySearchQuestion;

import static java.lang.Math.min;

public class Question2 {
    //find the minimum in rotated sorted array
    public int findMin(int[] arr){
        int ans = 1000000;
        int mid=0, left=0, right=arr.length-1;
        while (left<=right){
            mid = left + (right-left)/2;
            //if left half is sorted, take minimum from there and discard the left half
            if(arr[left]<=arr[mid]){
                ans = min(ans,arr[left]);
                left = mid+1;
            }
            //if right half is sorted, take minimum from there and discard the right half
            else {
                ans = min(ans,arr[mid]);
                right = mid-1;
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};
        Question2 obj = new Question2();
        System.out.println(obj.findMin(arr));
    }

}
