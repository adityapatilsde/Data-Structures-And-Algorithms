package Recursion.StringsRecursion;

import java.util.Scanner;
public class RemoveAllOccurencesOfA {
    static String removeA(String s, int idx){
        if (idx == s.length()) return "";

        String smallAns = removeA(s, idx+1);

        char currChar = s.charAt(idx);

        if (currChar != 'a'){
            return currChar + smallAns;
        }
        else {
           return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abcax";
        System.out.println(removeA(s,0));
    }
}
