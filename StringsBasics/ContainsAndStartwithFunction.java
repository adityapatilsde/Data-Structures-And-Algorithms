package StringsBasics;

public class ContainsAndStartwithFunction {
    public static void main(String[] args) {
        String str = "Aditya Patil";
        System.out.println(str.contains("itya"));
        // if it is in the strings returns true else false kind of searching

        System.out.println(str.startsWith("Adi"));
        //checks if the string starts with or not returns boolean values

        System.out.println(str.endsWith("il"));
        //checks if the strings ends with what letters returns boolean values

    }
}
