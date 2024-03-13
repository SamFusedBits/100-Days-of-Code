package src;

public class Shadowing {

//    Variable shadowing occurs when a local variable or parameter in a specific scope has the same name as a variable in an outer scope, causing the inner variable to "shadow" the outer one within its scope. This means that the inner variable hides the outer variable from being accessed within its scope.
//
//    Variable hiding, on the other hand, occurs when a subclass defines a static variable with the same name as a static variable in the superclass. In this case, the subclass's variable hides the superclass's variable, but it does not override it, as static members are not overridden in Java.
//    static class Superclass {
//        static int x = 10;
//    }
//
//    static class Subclass extends Superclass {
//        static int x = 20; // Variable hiding
//
//        void display() {
//            int x = 30; // Variable shadowing
//            System.out.println("Local x: " + x); // Prints the value of the local variable (30)
//            System.out.println("Subclass x: " + Subclass.x); // Prints the value of the subclass's variable (20)
//            System.out.println("Superclass x: " + Superclass.x); // Prints the value of the superclass's variable (10)
//        }
//    }
//
//    public static void main(String[] args) {
//        Subclass obj = new Subclass();
//        obj.display();
//    }
//}

   static class Animal {
            static String sound = "Roar!";
        }

        static class Lion extends Animal {
            static String sound = "Roarrrr!"; // Here, we're hiding the Animal's sound

            void makeSound() {
                String sound = "Growl!"; // I'm declaring a new sound just for this lion here, ignoring the other sounds
                System.out.println("Local sound: " + sound); // Prints the lion's growling sound
                System.out.println("Lion sound: " + Lion.sound); // Prints the lion's specific sound (Roarrrr!)
                System.out.println("Animal sound: " + Animal.sound); // Prints the generic animal sound (Roar!)
            }
        }

        public static void main(String[] args) {
            Lion lion = new Lion();
            lion.makeSound();
        }
    }