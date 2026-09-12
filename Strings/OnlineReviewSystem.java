package Strings;

import java.util.Scanner;

class Review{
    String customerName;
    String productName;
    String review;

    void takeInput(Scanner sc){
        System.out.println();
        System.out.print("Enter customer name: ");
        customerName = sc.nextLine();
        System.out.print("Enter product name: ");
        productName = sc.nextLine();
        System.out.print("Enter customer review: ");
        review = sc.nextLine();
    }
    void cleanReview(){
        StringBuilder sb = new StringBuilder(review);
        while (sb.length() > 0 && sb.charAt(0) == ' '){
            sb.deleteCharAt(0);
        }
        while (sb.length() > 0 && sb.charAt(sb.length()-1) == ' '){
            sb.deleteCharAt(sb.length() - 1);
        }

        review = sb.toString();
    }
    void reviewCheck(){
        System.out.println();
        System.out.println("Does review start with Excellent ? : "+review.startsWith("Excellent"));
        System.out.println("Does review contain quality ? : "+review.contains("quality"));
        System.out.println("Does review ends with ! ? : "+review.endsWith("!"));
    }
    void display(){
        System.out.println();
        System.out.println("Customer name: "+customerName);
        System.out.println("Product name: "+productName);
        cleanReview();
        System.out.println("Customer review: "+review);
    }
}
public class OnlineReviewSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Review r = new Review();
        r.takeInput(sc);
        r.display();
        r.reviewCheck();
    }
}
