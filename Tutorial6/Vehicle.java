package Tutorial6;
import java.util.Scanner;
 class vehicleBase {
     String vehicleNumber;
     String VehicleName;
     double speed;
     String brand;

     void takeInput(Scanner sc) {
         System.out.println("Enter vehicle Number: ");
         vehicleNumber = sc.nextLine();
         System.out.println("Enter vehicle Name: ");
         VehicleName = sc.nextLine();
         System.out.println("Enter vehicle speed: ");
         speed = sc.nextDouble();
         sc.nextLine();
         System.out.println("Enter vehicle brand name: ");
         brand = sc.nextLine();
     }

     void displayDetails() {
         System.out.println("Vehicle name: " + VehicleName);
         System.out.println("Vehicle number: " + vehicleNumber);
         System.out.println("Vehicle speed: " + speed);
         System.out.println("Vehicle brand: " + brand);
     }
 }

     class Bike extends vehicleBase {
        @Override
        void takeInput(Scanner sc){
            System.out.print("Enter Bike Number: ");
            vehicleNumber = sc.nextLine();
            System.out.print("Enter Bike Name: ");
            VehicleName = sc.nextLine();
            System.out.print("Enter Bike speed: ");
            speed = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Bike brand name: ");
            brand = sc.nextLine();
        }
        @Override
        void displayDetails(){
            System.out.println("Bike name: "+VehicleName);
            System.out.println("Bike number: "+vehicleNumber);
            System.out.println("Bike speed: "+speed);
            System.out.println("Bike brand: "+brand);
        }
    }
    class Car extends vehicleBase {
        @Override
        void takeInput(Scanner sc){
            System.out.print("Enter Car Number: ");
            vehicleNumber = sc.nextLine();
            System.out.print("Enter Car Name: ");
            VehicleName = sc.nextLine();
            System.out.print("Enter Car speed: ");
            speed = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Car brand name: ");
            brand = sc.nextLine();
        }
        @Override
        void displayDetails(){
            System.out.println("Car name: "+VehicleName);
            System.out.println("Car number: "+vehicleNumber);
            System.out.println("Car speed: "+speed);
            System.out.println("Car brand: "+brand);
        }
    }

    public class Vehicle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        vehicleBase v;

        v = new Bike();
        System.out.println("Enter bike details: ");
        v.takeInput(sc);
        System.out.println();
        System.out.println("Bike dwtails: ");
        v.displayDetails();
        System.out.println();

        vehicleBase c;
        c = new Car();
        System.out.println();
        System.out.println("Enter car details: ");
        c.takeInput(sc);
        System.out.println();
        System.out.println("car details: ");
        c.displayDetails();



    }

}
