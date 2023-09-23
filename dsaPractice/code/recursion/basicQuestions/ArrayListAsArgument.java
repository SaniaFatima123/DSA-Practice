package code.recursion.basicQuestions;

import java.util.ArrayList;

public class ArrayListAsArgument {
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,5,9,4};
        System.out.println(findAllIndex(arr, 4,0,new ArrayList<>()));
    }
    //if you are passing arraylist as parameter in recursion call it will reflect changes in the same object
    //if you are creating arraylist in the body of the method during recursion call, it will stay only for that particular call,
    // and it will change for the next recursion call everytime
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1,list);
    }
}
