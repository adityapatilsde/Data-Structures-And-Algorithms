package OOPSRevision;

import java.util.Scanner;
public class ConstructorOverloading {
    static public class Showroom{
        private String model;
        private double price;

        Showroom(){
            System.out.println("This is default constructor");
            System.out.println();
        }
        Showroom(String model) {
            this.model = model;
        }
        Showroom(String model , double price){
            this.model = model;
            this.price = price;
        }
        void displayDetilas(){
            System.out.println("MODEL NAME: "+model);
            System.out.println("PRICE: "+price);
            System.out.println();
        }
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

           Showroom s1 = new Showroom();
           Showroom s2 = new Showroom("Toyota Fortuner",160000);
           s2.displayDetilas();
           Showroom s3 = new Showroom("Audi Q8",900000);
           s3.displayDetilas();
        }
    }
}
