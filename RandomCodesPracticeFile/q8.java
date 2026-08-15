package RandomCodesPracticeFile;
import java.util.Scanner;
public class q8 {
    static int calculateTotalSalary(int basicSalary, int allowance){
        return basicSalary + allowance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic  salary: ");
        int basicSalary = sc.nextInt();
        System.out.print("Enter allowance: ");
        int allowance = sc.nextInt();
        System.out.println("Total salary: "+calculateTotalSalary(basicSalary,allowance));
    }
}
