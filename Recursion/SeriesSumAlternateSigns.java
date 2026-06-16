package Recursion;

//Alternate Sign series = 1 -2 +3 -4 +5 -6 +7 .............
import java.util.Scanner;
public class SeriesSumAlternateSigns {
    static int SeriesSum(int n) {
        if (n == 0) return 0;
        if (n % 2 == 0) {
            return SeriesSum(n - 1 )- n;
        }
        else  {
            return SeriesSum(n - 1 ) + n;
        }
    }
    public static void main(String[] args) {
        System.out.println(SeriesSum(5));
    }

}
