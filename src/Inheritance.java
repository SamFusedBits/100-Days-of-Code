package src;

public class Inheritance {
    //Q1. Explain the inheritance relationship between the Vehicle and Car classes,

    // Parent class
    static class Vehicle {
        protected String brand;

        // Constructor
        public Vehicle(String brand) {
            this.brand = brand;
        }
    }

    public static class Car extends Vehicle {
        private int year;

        // Constructor
        public Car(String brand, int year) {
            super(brand); // Calling parent class constructor
            this.year = year;
        }

        // Method to display car details
        public void displayDetails() {
            System.out.println("Car brand: " + brand);
            System.out.println("Year of manufacture: " + year);
        }
    }

        public static void main(String[] args) {
            // Creating an object of Car class
            Car car = new Car("BMW", 2024);

            car.displayDetails();
        }

//                                Day 2 of Inheritance
/*    Q2. Bird object has all the properties that an Animal object has, as well as some additional unique properties.
      Add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
    I am walking
    I am flying
    I am singing https://www.hackerrank.com/challenges/java-inheritance-1/problem?


          public static void main(String[] args) {
            class Animal {
                void walk() {
                    System.out.println("I am walking");
                }
            }
            class Bird extends Animal {
                void fly() {
                    System.out.println("I am flying");
                }

                void sing() {
                    System.out.println("I am singing");
                }
            }

            Bird bird = new Bird();
            bird.walk();
            bird.fly();
            bird.sing();

        }
    }*/



/*  Q3.  A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
    A class named Adder that inherits from a superclass named Arithmetic.
    Your classes should not be public.

    public static void main(String[] args) {
            class Arithmetic {

            }

            class Adder extends Arithmetic {
                public int add(int num1, int num2) {
                    return num1 + num2;
                }
            }

            Adder adder = new Adder();

            int sum = adder.add(40,40);

            System.out.println("My superclass is: Arithmetic");
            System.out.println("Sum: " + sum);
        }*/
}

/*      Inheritance is a mechanism by which a new class (subclass or child class) is derived
        from an existing class (superclass or parent class).
        The subclass inherits properties and behaviors from its superclass,
        allowing code reuse and promoting a hierarchical relationship between classes.  */