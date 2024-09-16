package code.recursion.basicQuestions.Strings;

import java.util.HashMap;

public class Question1 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        int n = s.length();
        HashMap<Character, Integer> m = new HashMap<>();
        char[] arr = s.toCharArray();
        for(int i=0; i<n; i++){
            if(m.containsKey(arr[i]) && m.get(arr[i]) >= left){
                left = m.get(arr[i])+1;
            }
            m.put(arr[i],i);
            maxLength = Math.max(maxLength, i-left+1);

        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        Question1 obj = new Question1();
        System.out.println(obj.lengthOfLongestSubstring(str));

    }
}
