package code.binarySearchQuestion;


public class Question3 {
//     Given an array of integers nums sorted in non-decreasing order,
//     find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].


    //Applying binary search to find the first occurrence
    public int findFirst(int[] arr, int len, int target){
        int first = -1, low = 0, high = len-1;


        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return first;
    }

    //Applying binary search to find the last occurrence
    public int findLast(int[] arr, int len, int target){
        int last = -1, low = 0, high = len-1;

        while(low<=high){
            int mid = (low + high)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return last;
    }
    public static void main(String[] args){
      int[] arr = {2 ,8 ,8 ,8 ,8 ,8 , 11, 13};
      int len = arr.length;
      int target = 8;
      int last = -1;
      int[] result = new int[2];

      Question3 obj = new Question3();
      int first = obj.findFirst(arr, len, target);
      //if data is not present then we will return -1 as first and last occurrence and we will not search for last occurrence
      if(first == -1){
          System.out.println(first+" "+last);
      }
      else {
          last = obj.findLast(arr, len, target);
              System.out.println(first+" "+last);
      }
    }
}
