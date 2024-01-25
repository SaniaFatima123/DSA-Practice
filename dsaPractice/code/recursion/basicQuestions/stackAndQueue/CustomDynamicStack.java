package code.recursion.basicQuestions.stackAndQueue;

public class CustomDynamicStack extends CustomStack{
    public CustomDynamicStack() {
        super(); // it will call CustomStack()
    }
    public CustomDynamicStack(int size) {
        super(size); // it will call CustomStack(int size)
    }

    @Override
    public boolean push(int n) throws StackException {
        // this takes care of it being full
        if(isFull()){
            // double the array size
            int[] temp = new int[data.length*2];
            // copy all previous items in new data
            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.push(n);
    }
}
