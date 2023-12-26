package code.recursion.basicQuestions.String;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//      subseq("","abc");
        System.out.println(subSeq("","abc"));
    }

//    code for printing subsequence with no return type
    public static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        //       including character
        subseq(p+ch, up.substring(1));
        //       excluding character
        subseq(p, up.substring(1));
    }
    //    code for printing subsequence with return type ArrayList<String>
    public static ArrayList<String> subSeq(String p, String up){
       if(up.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
       }
        char ch = up.charAt(0);
//       including character
        ArrayList<String> left = subSeq(p+ch, up.substring(1));
//        excluding character
        ArrayList<String> right = subSeq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
