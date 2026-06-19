package Recursion.StringsRecursion;

import java.util.Scanner;
public class ReverseAStringRecursion {
    static String reverseString(String s, int idx){
        if (idx == s.length()){
            return "";
        }
        String smallAns =  reverseString(s,idx+1) ;
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Reversed String: ");
        System.out.println(reverseString(s,0));
    }
}
