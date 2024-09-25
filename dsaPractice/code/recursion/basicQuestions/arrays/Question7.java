package code.recursion.basicQuestions.arrays;

public class Question7 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] prefixProdStart = new int[n];
        int[] prefixProdEnd = new int[n];

        prefixProdStart[0] = nums[0];
        prefixProdEnd[n-1] = nums[n-1];

        for(int i=1; i<n; i++){
            prefixProdStart[i] = prefixProdStart[i-1]*nums[i];
        }
        for(int i=n-2; i>=0; i--){
            prefixProdEnd[i] = prefixProdEnd[i+1]*nums[i];
        }
        result[0] = prefixProdEnd[1];
        result[n-1] = prefixProdStart[n-2];
        for(int i=1; i<n-1; i++){
            result[i] = prefixProdStart[i-1]*prefixProdEnd[i+1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        Question7 obj = new Question7();
        int[] result =  obj.productExceptSelf(arr);
        for(int n: result){
            System.out.println(n);
        }
    }
}
