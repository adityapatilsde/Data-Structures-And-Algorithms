package ObjectOrientedProgramming;

import Arrays.practice;

public class Constructor {
    public static class Book{
        String name;
        String title;
        double price;

        public Book(){ //Default constructor

        }
        public Book(String name, String title, double price){ //Parametrized Constructor
            this.name = name;
            this.title = title;
            this.price = price;
        }
        void display(){
            System.out.println("Book name: "+name);
            System.out.println("Author's name: "+title);
            System.out.println("Book's price: "+price);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book s2 = new Book("C programming","Dennis ritchie",400.00);
        s2.display();

        //s1 and s2 are accessing parametrized constructor

        Book s3 = new Book();
        s3.name = "Data structures and algorithms";
        s3.title = "Allen";
        s3.price = 500;
        s3.display();

        //s3 is accessing default constructor
    }
}
