package code.recursion.basicQuestions.stackAndQueue;

public class StackMain {
    public static void main(String[] args) {
        CustomStack  customStack = new CustomStack(5);
        try {
            customStack.push(2);
            customStack.push(4);
            customStack.push(1);
            customStack.push(9);
            customStack.push(5);

            System.out.println(customStack.pop());
            System.out.println(customStack.pop());
            System.out.println(customStack.pop());
            System.out.println(customStack.pop());
            System.out.println(customStack.pop());
//            System.out.println(customStack.pop());
//            System.out.println(customStack.peek());
        }
        catch (StackException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
