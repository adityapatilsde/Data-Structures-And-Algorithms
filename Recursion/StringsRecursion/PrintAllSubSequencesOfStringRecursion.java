package Recursion.StringsRecursion;

import java.util.Scanner;
public class PrintAllSubSequencesOfStringRecursion {

    static void printSSQ(String s, String currAns){
        if (s.length() == 0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0); // stored char at 0th index // a
        String remString = s.substring(1); // remaining string after 0th index // bc


        //Curr char ️ ️️chooses to be a part of currAns

         printSSQ(remString,currAns + curr); // bc , a

        //Curr char  does not chooses to be a part of currAns
        printSSQ(remString, currAns); // bc + " "
    }
    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}
