package Stack.ProblemSolving;
import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        Stack<Integer> rt = new Stack<>();

        while (st.size() > 0) {
            rt.push(st.pop());
        }

        System.out.println("Second Stack: " + rt);

        Stack<Integer> qt = new Stack<>();

        while (rt.size() > 0) {
            qt.push(rt.pop());
        }

        System.out.println("Third Stack: " + qt);

        while (qt.size() > 0) {
            st.push(qt.pop());
        }

        System.out.println("Reversed Stack: " + st);
    }
}
