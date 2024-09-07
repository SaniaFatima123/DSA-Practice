package code.recursion.basicQuestions.arrays;

public class Question1 {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(sum, maxSum);
            if (sum <= 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Question1 obj = new Question1();
        System.out.println(obj.maxSubArray(nums));

    }
}
