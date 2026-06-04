package Arrays.ProblemSolvingInArrays;

/*swap two variables  a and b without using a temp variable */

public class SwapWithoutTempVariable {
    static void swap(int a , int b){
        System.out.println("Orignal value of a: "+a);
        System.out.println("Orignal value of b: "+b);

        a = a + b; // 2 + 4 =6
        b = a - b; // 6 - 4 = 2 /// a = 6, b = 2
        a = a - b; //  6 - 2 = 4 // a = 4 , b = 2

        System.out.println();
        System.out.println("Swapped value of a: "+a);
        System.out.println("Swapped value of b: "+b);

    }

    public static void main() {
        int a = 5;
        int b = 10;

        swap(a,b);
    }
}
