package OOPSRevision;

 public  class animal {
       static class Animal{
        void eat() {
            System.out.println("Animal eats");
        }
    }

   static class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }

    interface Pet {
        void play();
    }

    static class Puppy extends Dog implements Pet {

        public void play() {
            System.out.println("Puppy plays");
        }
    }
        public static void main(String[] args) {

            Puppy p = new Puppy();

            p.eat();
            p.bark();
            p.play();
        }
}
