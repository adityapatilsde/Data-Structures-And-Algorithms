package BasicsofJava.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int p = 5 , q = 5;

        /*POST INCREMENT P++ = Print first assign later
         PRE INCREMENT ++P = Assign first print later */

        System.out.println(p++); // 5 print first
        System.out.println(p); // 6 assign and print

        System.out.println(++q); // 6 assign first
        System.out.println(q); // 6  print current value

        int x  = p++; //  x = 6 and p = 7
        int y = ++q;  // y = 7 and q = 7

        System.out.println(x); // 6
        System.out.println(y); // 7

        System.out.println(p); // 7
        System.out.println(q); // 7
    }
}
