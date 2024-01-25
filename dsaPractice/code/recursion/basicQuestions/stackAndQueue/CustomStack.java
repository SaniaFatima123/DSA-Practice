package code.recursion.basicQuestions.stackAndQueue;

public class CustomStack {
    //stack internally implements array
    protected int[] data;
    //since stack implements array, size cannot be dynamic
    private static final int Default_size = 10;

    int ptr = -1;

    public CustomStack() {
        this(Default_size);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int n) throws StackException{
        if(isFull()){
            throw new StackException("Cannot push its Full");
        }
        ptr++;
        data[ptr] = n;
        return true;
    }
    public int pop()throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop its Empty");
        }
        int n = data[ptr];
        this.ptr--;
        return n;
    }
    public int peek()throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek its Empty");
        }
        return data[ptr];
    }
    public boolean isFull(){
        return this.ptr == data.length-1;
    }
    public boolean isEmpty(){
        return this.ptr==-1;
    }

}
