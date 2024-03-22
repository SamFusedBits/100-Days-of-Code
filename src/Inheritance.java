package src;

public class Inheritance {
    // Explain the inheritance relationship between the Vehicle and Car classes,

    // Parent class
    static class Vehicle {
        protected String brand;

        // Constructor
        public Vehicle(String brand) {
            this.brand = brand;
        }

        public void displayBrand() {
            System.out.println("Brand of the vehicle: " + brand);
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
    }

/*      Inheritance is a mechanism by which a new class (subclass or child class) is derived
        from an existing class (superclass or parent class).
        The subclass inherits properties and behaviors from its superclass,
        allowing code reuse and promoting a hierarchical relationship between classes.  */

