import java.util.Stack;

public class threeStacks {
    public static void main(String[] args) {

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        s1.push(10);
        s1.push(20);
        s1.push(30);

        s2.push(40);
        s2.push(50);
        s2.push(60);

        s3.push(70);
        s3.push(80);
        s3.push(90);

        System.out.println("Stack 1: " + s1);
        System.out.println("Stack 2: " + s2);
        System.out.println("Stack 3: " + s3);

        System.out.println("Popped from Stack 1: " + s1.pop());
        System.out.println("Popped from Stack 2: " + s2.pop());
        System.out.println("Popped from Stack 3: " + s3.pop());

        System.out.println("Peek Stack 1: " + s1.peek());
        System.out.println("Peek Stack 2: " + s2.peek());
        System.out.println("Peek Stack 3: " + s3.peek());

        System.out.println("Stack 1 Empty: " + s1.empty());
        System.out.println("Stack 2 Empty: " + s2.empty());
        System.out.println("Stack 3 Empty: " + s3.empty());
    }
}