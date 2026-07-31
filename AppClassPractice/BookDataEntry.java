package AppClassPractice;

import java.util.Scanner;

public class BookDataEntry {
    public static class Book{
        double price;
        String name;
        String author;

        void takeInput(Scanner sc){
            System.out.print("Enter Book name: ");
            name = sc.nextLine();
            System.out.print("Enter Book's author name: ");
            author = sc.nextLine();
            System.out.print("Enter Books's price: : ");
            price = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }
        void display(){
            System.out.println("Book name: "+name);
            System.out.println("Author's name: "+author);
            System.out.println("Books's price: "+price);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Books details to be entered: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println();

            Book data[] = new Book[n];
            for (int i = 0; i < n; i++){
            System.out.println("Enter book "+(i+1)+" details: ");
            data[i] = new Book();
            data[i].takeInput(sc);
        }
        System.out.println("Book details: ");
        System.out.println();
        for (int i = 0; i < n; i++){
            data[i].display();
        }
    }
}
