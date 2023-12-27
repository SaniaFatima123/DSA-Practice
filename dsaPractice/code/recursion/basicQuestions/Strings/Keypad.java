package code.recursion.basicQuestions.Strings;

import java.util.ArrayList;
import java.util.List;

//google question
// *********
public class Keypad {
    public static void main(String[] args) {
//           pad("","12");
//        System.out.println(padRet("", "12"));
//        System.out.println(padCount("", "12"));
        System.out.println(letterCombinations("", "23"));
    }
    //return type void
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            pad(p+ch, up.substring(1));
        }
    }
    //return type arraylist
    static ArrayList<String> padRet(String p, String up){
        if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            list.addAll(padRet(p+ch, up.substring(1)));

        }
        return list;
    }
    //count answer
    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3; i<digit*3; i++){
            char ch = (char)('a' + i);
            count = count + padCount(p+ch, up.substring(1));

        }
        return count;
    }
//google question with 2 parameters but in actual there was 1 parameter
    public static List<String> letterCombinations(String p, String up) {
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        List<String> list = new ArrayList<>();
        for(int i = (digit-2)*3; i<(digit-1)*3; i++){
            char ch = (char)('a' + i);
            list.addAll(letterCombinations(p+ch, up.substring(1)));

        }
        return list;
    }
}
