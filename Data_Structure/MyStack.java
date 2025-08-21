package Data_Structure;

public class MyStack {
    private int max_size;
    private int[] stackArray;
    private int top;

    public MyStack(int size){
        max_size = size;
        stackArray = new int[max_size];
        top = -1;
    }

    //Define methods
    public void push(int number){
        if(!isFull()){
            stackArray[++top] = number;
        }
    }

    public int pop(){
        if(!isEmpty()){
            return stackArray[top--];
        }
        return -1; 
    }

    public int peek(){
        if(!isEmpty()){
            return stackArray[top];
        }
        return -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == max_size - 1;
    }
}
