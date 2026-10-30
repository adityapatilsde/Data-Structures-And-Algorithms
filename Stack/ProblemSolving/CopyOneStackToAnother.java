package Stack.ProblemSolving;
import java.util.Scanner;
import java.util.Stack;

public class CopyOneStackToAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        Stack<Integer> gt = new Stack<>();
        while (st.size() > 0){
            gt.push(st.pop());
        }
        Stack<Integer> rt = new Stack<>();
        while (gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);

    }
}
