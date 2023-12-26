package code.recursion.basicQuestions.String;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
    int[] arr = {1,2,3};
        List<List<Integer>> list = subSet(arr);
        for(List<Integer> item: list){
            System.out.println(item);
        }
    }
    public static List<List<Integer>> subSet(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
