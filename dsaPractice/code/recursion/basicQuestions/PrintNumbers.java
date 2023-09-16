package code.recursion.basicQuestions;

public class PrintNumbers {
    public static void main(String[] args) {
//       func1(5);
//        System.out.println("func1 ends ******************");
//        func2(5);
//        System.out.println("func2 ends ******************");
 //       func3(5);
    }
    static void func1(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        func1(n-1);
    }
    static void func2(int n){
        if(n==0){
            return ;
        }
        func2(n-1);
        System.out.println(n);
    }
    static void func3(int n){
        if(n==0){
            return ;
        }

        System.out.println(n);
        //this n-- is post decrement, hence it first pass the value and then decrease the value by 1,
        // since it is a recursion call it is never being able to pass 5-1=4
        func3(n--);
    }
}
