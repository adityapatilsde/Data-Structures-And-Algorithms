package StringsBasics;

import java.util.Scanner;
public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Hello";
        System.out.println(str.length());

        String str1 = "Hello World";
        //also counts space
        System.out.println(str1.length());
    }
}
