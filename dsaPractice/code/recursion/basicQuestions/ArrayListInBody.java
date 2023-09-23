package code.recursion.basicQuestions;

import java.util.ArrayList;

public class ArrayListInBody {
    public static void main(String[] args) {
        int[] arr = {2,43,76,4,7,5,4,5};
        System.out.println(findAllIndex(arr, 4,0));
    }
    //if you are creating arraylist in the body of the method during recursion call, it will stay only for that particular call,
    // and it will change for the next recursion call everytime
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
