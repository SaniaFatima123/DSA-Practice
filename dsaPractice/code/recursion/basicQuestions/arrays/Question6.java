package code.recursion.basicQuestions.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Question6 {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        if(nums == null || n == 0){
            return "";
        }

        //converting int[] to String[]
        String[] strArr = new String[n];
        for(int i=0; i<n; i++){
            strArr[i] = String.valueOf(nums[i]);
        }
        //creating comparator for comparing two cases to decide which string should come first
        // String s1 = "9";
        // String s2 = "31";

        // String case1 =  s1 + s2; // 931
        // String case2 = s2 + s1; // 319
        Comparator<String> comp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String str1 = s1+s2;
                String str2 = s2+s1;
                return str2.compareTo(str1);
            }
        };
        Arrays.sort(strArr, comp);

        if(strArr[0].charAt(0) == '0'){
            return "0";
        }
        StringBuilder sb= new StringBuilder();
        for(String s: strArr){
            sb.append(s);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        Question6 obj = new Question6();
        System.out.println(obj.largestNumber(nums));
    }
}
