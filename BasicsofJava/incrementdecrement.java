package BasicsofJava;

public class incrementdecrement {
    public static void main(String[] args) {
             int x = 5;
             int y = 10;

             ++x; // this means x = x + 1
        //first increases the value by 1 and then prints
        System.out.println(x);
             ++y; // this means y = y + 1
        //first increases the value by 1 and then prints
        System.out.println(y);

             // now the x = 6 and y = 11

        // first prints the cureent value and then increases by 1
        System.out.println(x++); // prints 6 , now x becomes 7
        System.out.println(x); // prints x

        // first prints the cureent value and then increases by 1
        System.out.println(y++); // prints 11 , now x becomes 12
        System.out.println(y); // prints 12
    }
}
