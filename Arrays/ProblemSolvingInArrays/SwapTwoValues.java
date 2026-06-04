package Arrays.ProblemSolvingInArrays;

/*There are 2 variables a and b  swap their values*/

import java.util.Scanner;
public class SwapTwoValues {
    static void swap(int a , int b){
        System.out.println("Orignal value of a: "+a);
        System.out.println("Orignal value of b: "+b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println();
        System.out.println("Swapped value of a: "+a);
        System.out.println("Swapped value of b: "+b);
    }

    static void main() {
        int a = 5;
        int b = 10;

        swap(a,b);
    }
}
