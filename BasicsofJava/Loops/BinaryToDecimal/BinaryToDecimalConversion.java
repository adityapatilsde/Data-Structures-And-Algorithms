package BasicsofJava.Loops.BinaryToDecimal;

import java.util.Scanner;
public class BinaryToDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
         int binary_num = sc.nextInt();

         int ans = 0; // converted decimal number
         int pw = 1;  // 2 ^ 0 = 1 power of 2

         while (binary_num > 0){
             int unit_digit = binary_num % 10;
             ans += (unit_digit * pw);
             binary_num /= 10;
             pw *= 2;

         }
        System.out.println("Converted binary to decimal: "+ans);
    }
}
