package Stack.ProblemSolving;

public class ValidParentheses {
    char stack[];
    int top ;
    int capacity;

    ValidParentheses(int size){
        stack = new char[size];
        top = -1;
        capacity = size;
    }

    boolean isEmpty(){
        return top == -1;
    }
    boolean isFull(){
        return top == capacity - 1;
    }

    void push(char value){
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

    int peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    void display(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements (top to bottom)");
        for (int i = top; i >= 0; i--){
            System.out.println(stack[i]);
        }
        System.out.println();
    }

     boolean isValid(String s){
        top = -1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch);
            } else {
                if (isEmpty()) {
                    return false;
                }

                char peekvalue = (char) peek();

                if ((ch == '}' && peekvalue != '{') ||
                        (ch == ')' && peekvalue != '(') ||
                        (ch == ']' && peekvalue != '[')) {
                    return false;
                }
                pop();
            }
        }
        return isEmpty();
     }
    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses(100);

        String s = "{[]}";
        System.out.println(obj.isValid(s));
    }
}
