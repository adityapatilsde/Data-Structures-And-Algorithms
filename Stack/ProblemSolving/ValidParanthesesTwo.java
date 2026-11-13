
import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesesTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets: ");
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();
        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            // Check closing brackets
            else {
                if (st.empty()) {
                    valid = false;
                    break;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    valid = false;
                    break;
                }
            }
        }

        if (!st.empty()) {
            valid = false;
        }

        if (valid) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }

        sc.close();
    }
}
