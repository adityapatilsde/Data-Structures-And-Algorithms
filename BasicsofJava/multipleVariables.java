package BasicsofJava;

public class multipleVariables {
    static void main(String[] args) {

        int x = 5;
        int y = 6;
        int z = 7;

        System.out.println("The value of x is: " + x);
        System.out.println("The value of y  is: " + y);
        System.out.println("The value of z is: " + z);
        System.out.println(x + y + " Hello " + y + z);
        // Java reads from left to right.
        // x + y = 11 because both are integers.
        // After "Hello" appears, everything becomes a string.
        // So the output becomes: 11 Hello 67

        //but 6,7 is also integer why not sum ? :: Because after Java sees a
        // String, the + operator changes from
        // addition to string concatenation (joining text).
    }

    }


