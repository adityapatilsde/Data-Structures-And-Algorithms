package StringsBasics;

public class ImmutabilityOfStrings {
    public static void main(String[] args) {
        String str = "Hello";
        str = str.substring(0,2)+"y"+str.substring(3);
        System.out.print(str);
    }
}
