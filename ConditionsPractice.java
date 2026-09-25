import java.util.Scanner;
class Conditions{
    static void PosNegZero(int num){
        if (num > 0){
            System.out.println("Positive number");
        }
        else if(num < 0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }
    }
    static void evenodd (int num){
        if (num %2 == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }
    static void divby5(int num){
        if (num %5 == 0){
            System.out.println(num+" is divisible by 5");
        }
    }
    static void divby3and5(int num){
        if (num %5 == 0 && num %3 == 0){
            System.out.println("Number is divisible by both 3 and 5");
        }
        else {
            System.out.println("Divisibility check failed");
        }
    }
    static void leapYear(int year){
        if (year %400 == 0){
            System.out.println("Leap year");
        } else if (year %100 == 0) {
            System.out.println("Not a leap year");
        } else if (year %4 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
    static void largestNum(int num1,int num2){
        if (num1 > num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else if(num2 > num1){
            System.out.println(num2+" is greater than "+num1);
        }
        else{
            System.out.println("Both are equal");
        }
    }
    static void largestNumm(int num1,int num2,int num3){
        if (num1 > num2 && num1 > num3){
            System.out.println(num1+" is greater than "+num2);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2+" is greater than "+num1);
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println(num2+" is greater than "+num1);
        }
        else{
            System.out.println("ALL are equal");
        }
    }
    static void tempresult(int temp){
        if (temp > 30 && temp < 40){
            System.out.println("Temp: HOT");
        } else if (temp > 21 && temp < 30) {
            System.out.println("Temp: WARM");
        }
        else{
            if (temp < 20){
                System.out.println("TEMP: COLD");
            }
        }
    }
    static void vowelConsonant(String a){
        if (a == "a" || a == "e" || a == "i" || a == "o" || a == "u"
        || a == "A" || a == "E" || a == "I" || a == "O" || a == "U"){
            System.out.println("Its a Vowel");
        }
        else {
            System.out.println("Its a consonant");
        }
    }
    static void Typeofchar(char ch){
        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("UPPERCASE");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("LOWERCASE");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("DIGIT");
        }
        else {
            System.out.println("Special charecter");
        }
    }
    static void ValidTriangle(int s1,int s2,int s3){
        if (s1 + s2 + s3 == 180){
            System.out.println("Valid triangle");
        }
        else{
            System.out.println("Invalid triangle");
        }
    }
    static void liesbtwn(char ch){
        if (ch >= 'a' && ch <= 'm'){
            System.out.println("Lies between a and m");
        } else if (ch >= 'n' && ch <= 'z') {
            System.out.println("Lies between n and z");
        }
        else {
            System.out.println("Test condition failed");
        }
    }
    static void noofDays(int month){
        if (month == 1 || month == 3 || month == 5 || month == 7
        || month == 8 || month == 10 || month == 12){
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2) {
            System.out.println("28 or 29 days");
        }
        else {
            System.out.println("Invalid month");
        }
    }
   static
}
public class ConditionsPractice {
}
