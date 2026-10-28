package Stack.ProblemSolving;

public class NextGreaterElement {
    int stack[];
    int top;
    int capacity;

    NextGreaterElement(int size){
        stack = new int[size];
        top = -1;
        capacity = size;
    }

    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == capacity - 1;
    }

    void push(int value){
        if (isFull()){
            System.out.println("Stack overflow");
        }
        else{
            top++;
            stack[top] = value;
        }
    }

    int pop(){
        if (isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        else{
            System.out.println("Stack elements (Top to Bottom)");
            for (int i = top; i >= 0; i--){
                System.out.println(stack[i]);
            }
            System.out.println();
        }
    }

    int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    int[] nextGreaterElement(int [] arr){
        int n = arr.length;
        int[] result = new int[n];

        top = -1;

        for (int i = n - 1; i >= 0; i++){

            while (!isEmpty() && peek() <= arr[i]){
                pop();
            }

            if (isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = peek();
            }

            push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
