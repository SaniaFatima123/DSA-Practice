package code.recursion.basicQuestions;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);
    }
}
