package BasicsofJava.Loops;

/*Print the first multiple of 5 and 7 using break keyword */
import java.util.Scanner;
public class Multiplesof5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 1;

        while (true){
            if ((num %5 == 0) && (num %7 == 0)){
                System.out.println("The first multiple pf 5 and 7 is: "+num);
                break;
            }
            num++;
        }
    }
}
