package BasicsofJava.Conditionals;
/*If the ages pf ram shyam and ajay are input through the keyboard , write a
* program to determine the youngest of the three without using logical operators*/

import java.util.Scanner;
public class AgeCheckWithoutLogicalOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Ram's Age: ");
        int ramAge = sc.nextInt();

        System.out.print("Enter Shyam's Age: ");
        int shyamAge = sc.nextInt();

        System.out.print("Enter Ajay's Age: ");
        int ajayAge = sc.nextInt();

        if(ramAge < shyamAge){
            if(ramAge < ajayAge){
                System.out.println("Ram is the youngest among them");
            }
            else {
                System.out.println("Ajay is the youngest among them");
            }
        }
        else {
            if(shyamAge < ajayAge){
                System.out.println("Shyam is the youngest among them");
            }
            else{
                System.out.println("Ajay is the youngest among them");
            }
        }
    }
}
