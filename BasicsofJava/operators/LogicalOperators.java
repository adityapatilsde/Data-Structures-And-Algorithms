package BasicsofJava.operators;

public class LogicalOperators {
   public static void main(String[] args) {
        int p = 15 , q = 10 , r = 5;

        // && AND operator all the values must be true
       System.out.println((p > q) && (p > r));// true
       System.out.println((p > q) && (p < r)); // false

       // OR || OPERATOR any one value must be true
       System.out.println((r < q) || (p < q));// true
       System.out.println((p > q) || (q > r));// true
       System.out.println((p < q) || (q > r));// true

       // ! operator return the false statement as true and true as false
       System.out.println(!(p == q)); // true
       System.out.println(!(p > q)); // false

    }
}
