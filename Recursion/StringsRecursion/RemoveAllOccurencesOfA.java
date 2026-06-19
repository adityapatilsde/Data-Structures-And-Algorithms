package Recursion.StringsRecursion;

import java.util.Scanner;
public class RemoveAllOccurencesOfA {
    static String removeA(String s, int idx) {
        //Base case
        if (idx == s.length()){
            return "";
        }
        // Recursive work
        String smallAns = removeA(s,idx+1);
        char currChar = s.charAt(idx);

        // self work
        if (currChar != 'a'){
            return currChar + smallAns;
        }
        else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to remove A occurences in it: ");
        String s = sc.nextLine();
        System.out.println(removeA(s,0));
    }
}
