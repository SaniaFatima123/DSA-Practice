package code.recursion.basicQuestions.arrays;

import java.util.Arrays;

public class Question4 {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int ans = target;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n; i++){
            //setting low and high for each iteration
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }
                //finding the minimum difference between target and potential closest sum,
                // one with the minimum difference is the closest
                int diff = Math.abs(sum-target);
                if(diff < minDiff){
                    minDiff = diff;
                    ans = sum;
                }
                if(sum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        Question4 obj = new Question4();
        System.out.println(obj.threeSumClosest(nums, target));
    }
}
