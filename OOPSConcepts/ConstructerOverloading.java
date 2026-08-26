package OOPSConcepts;

import java.util.Scanner;

class Book{
    String title;
    String Author;
    double price;

    // No argument constructor
    Book(){
        title = "Data structures and algorithms";
        Author = "Aditya Patil";
        price = 3000.0;
    }

    //parametrized constructor
    Book(String title,String Author,double price){
        this.title = title;
        this.Author = Author;
        this.price = price;
    }

    //Copy constructor
    Book(Book b){
        this.title = b.title;
        this.Author = b.Author;
        this.price = b.price;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Authot: "+Author);
        System.out.println("Price: "+price);
        System.out.println();
    }

}
public class ConstructerOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();
        // non parametrized constructor called using b1 object
        Book b2 = new Book("C programming","Yaswanth kanetkar",1500.0);
        //Parametrized constructor called using b2 object
        Book b3 = new Book(b2);
        //Copy constructor called using b3 object by passing b2 as argument to copy b2 into new object b3

        //Display
        System.out.println("Book 1 Details");
        b1.display();

        System.out.println("Book 2 Details");
        b2.display();

        System.out.println("Book 3 Details");
        b3.display();
    }
}
