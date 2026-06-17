package StringsBasics;

import java.util.Scanner;
public class PrintString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declaring a string and taking input from user
        //if you want a single word to print use sc.nextInt() or
        //we want full line use sc.NextLine()
        String s = sc.nextLine();
        System.out.println(s);

        // Accesing single charecters in the string
        char ch = s.charAt(0);
        System.out.println(ch);

        // loop method to print full string
        for (int i = 0 ; i < s.length(); i++){
            System.out.print(s.charAt(i));
        }
        System.out.println();

        //prints charecters from start index like from 2 to end index - 1 like 4-1 = 3 so
        // 2 and 3rd will be printed
        System.out.println(s.substring(2,4));

        //prints all chaecters from begin index given till n-1
        System.out.println(s.substring(0));
    }
}
