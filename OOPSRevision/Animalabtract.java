package OOPSRevision;

  abstract class Animalabstract {

        // Abstract method
        abstract void sound();

        // Normal method
        void eat() {
            System.out.println("Animal is eating");
        }

        void sleep() {
            System.out.println("Animal is sleeping");
        }
    }


    // Child class 1
    class Dog extends Animalabstract {

        @Override
        void sound() {
            System.out.println("Dog barks");
        }

        void run() {
            System.out.println("Dog is running");
        }
    }


    // Child class 2
    class Cat extends Animalabstract {

        @Override
        void sound() {
            System.out.println("Cat meows");
        }

        void climb() {
            System.out.println("Cat is climbing");
        }
    }


    // Main class
    public class Main {

        public static void main(String[] args) {

            // Cannot create object of abstract class
            // Animal a = new Animal();  // ERROR

            Dog d = new Dog();

            d.sound();
            d.eat();
            d.sleep();
            d.run();

            System.out.println();

            Cat c = new Cat();

            c.sound();
            c.eat();
            c.sleep();
            c.climb();

            System.out.println();

            // Parent reference, child object
            Animalabstract a1 = new Dog();
            Animalabstract a2 = new Cat();

            a1.sound();
            a1.eat();

            a2.sound();
            a2.eat();
        }
    }

