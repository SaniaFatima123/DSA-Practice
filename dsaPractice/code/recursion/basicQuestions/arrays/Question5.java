package code.recursion.basicQuestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        // Return empty list if the input array has fewer than 4 elements
        if (n < 4) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<n; i++){
            //skip duplicate element to avoid repeated quesadruplets
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<n; j++){
                //skip duplicate element to avoid repeated quesadruplets
                if(j!=i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                // Initialize two pointers: k and l
                int k = j+1;
                int l = n-1;
                // Two-pointer approach to find the remaining two elements
                while(k<l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        // Add the quadruplet to the result list if the sum matches the target
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        result.add(temp);
                        k++;
                        l--;
                        // Skip duplicates for the third element
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        // Skip duplicates for the fourth element
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                    }
                    // If sum is less than the target, move the left pointer k forward
                    else if(sum<target){
                        k++;
                    }
                    // If sum is greater than the target, move the right pointer l backward
                    else{
                        l--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        Question5 obj = new Question5();
        System.out.println(obj.fourSum(nums, target));
    }
}
