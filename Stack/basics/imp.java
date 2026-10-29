package Stack.basics;

import java.util.Stack;

public class imp {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println("Size is: "+st.size());
        System.out.println(st);


        System.out.println(st.isEmpty());
        System.out.println("size is: "+st.size());
        System.out.println(st);
        st.push(10);
        System.out.println("size is: "+st.size());
        System.out.println(st);
        st.push(20);
        System.out.println("size is: "+st.size());
        System.out.println(st);
        st.push(30);
        System.out.println("size is: "+st.size());
        System.out.println(st);
        st.push(40);
        System.out.println("size is: "+st.size());
        System.out.println(st);
        st.push(50);
        System.out.println("size is: "+st.size());
        System.out.println(st);

        System.out.println(st.isEmpty());
    }
}
