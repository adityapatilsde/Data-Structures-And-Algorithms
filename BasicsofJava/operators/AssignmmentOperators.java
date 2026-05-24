package BasicsofJava.operators;

public class AssignmmentOperators {
    public static void main() {
        int p = 10;
        int q;

        // = assignmnent operator
        q = p;
        System.out.println(q); // 10 (p value is assigned to q)

        // += addition assignment operator
        p += q; // this is just simply p = p + q which is p = 10 + 10 = 20
        System.out.println(p);

        // -= subtraction assignment operator
        p -= q; // this is just simply p = p - q which is 20 - 10 = 10
        System.out.println(p);

        // *= multiplication assignment operator
        p *= q; // this is just simply p = p * q which is 10 * 10 = 100
        System.out.println(p);

        // Division assignment operator /=
        p /= q; // this is simply p = p / q which is  100 / 10 = 10
        System.out.println(p);
    }

}
