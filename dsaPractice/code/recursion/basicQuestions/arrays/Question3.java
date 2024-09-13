package code.recursion.basicQuestions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n; i++){
            //removing duplicates
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            //initialize 2 pointers(setting low and high)
            int j = i + 1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum<0){
                    j++;
                }
                else if(sum>0){
                    k--;
                }
                else{
                    List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(list);
                    j++;
                    k--;
                    //skip duplicates
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    //skip duplicates
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Question3 obj = new Question3();
        System.out.println(obj.threeSum(nums));
    }
}
