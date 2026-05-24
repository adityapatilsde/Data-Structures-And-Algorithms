package BasicsofJava.Conditionals;

/*Take a positive integer input and tell if it is a
* three digit number*/


import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(n > 100 && n < 1000){
            System.out.println(n+" is a three digit numbers");
        }
        else{
            System.out.println(n+" is not a three digit number");
        }
    }
}
