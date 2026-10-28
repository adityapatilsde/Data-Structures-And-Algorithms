package Stack.basics;


public class implementation {
 int stack[];
 int capacity;
 int top;

 implementation(int size) {
     stack = new int[size];
     capacity = size;
     top = -1;
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
     }
     else{
         System.out.println("Stack elements (top to bottom)");
         for (int i = top; i >= 0; i--){
             System.out.println(stack[i]);
         }
     }
 }
 public static void main(String[] args) {
     implementation s = new implementation(5);

     s.push(20);
     s.push(10);

     s.display();
 }


}
