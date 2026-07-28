package RevisionFolder;
import java.util.Scanner;

public class sumOfFirtsNnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int answer = 0;

        for (int i = 0; i <= n; i++){
             answer = answer  + i;
        }
        System.out.println(answer);

        int ans = 0;
        int j = 1;
        while (j <= n){
            ans = ans + j;
            j++;
        }
        System.out.println(ans);
    }
}

