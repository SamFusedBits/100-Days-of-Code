package src;

public class Encapsulation {

/*    Encapsulation is a fundamental concept in object-oriented programming (OOP) that involves bundling data
    (attributes) and methods (functions) that operate on the data within a single unit,
    often referred to as a class. It allows for the control of access to the data by defining visibility
    modifiers (e.g., public, private) and provides a way to ensure that data is accessed and modified in a controlled manner.*/

    //Encapsulate data related to a person's health information such as their weight, height and heart rate.
    public static class Person {
        private double weight; // kilograms
        private double height; // meters
        private int heartRate; // beats per minute

        // Constructor
        public Person(double weight, double height) {
            this.weight = weight;
            this.height = height;
            this.heartRate = 0;
        }

        public double getWeight() {
            return weight;
        }

        public double getHeight() {
            return height;
        }

        public int getHeartRate() {
            return heartRate;
        }

        public void setWeight(double weight) {
            if (weight > 0) {
                this.weight = weight;
            } else {
                System.out.println("Invalid weight value.");
            }
        }

        public void setHeight(double height) {
            if (height > 0) {
                this.height = height;
            } else {
                System.out.println("Invalid height value.");
            }
        }

        public void setHeartRate(int heartRate) {
            if (heartRate >= 0) {
                this.heartRate = heartRate;
            } else {
                System.out.println("Invalid heart rate value.");
            }
        }

        // Other methods
        public double calculateBMI() {
            return weight / (height * height);
        }

        public void exercise() {
            // Simulating an increase in heart rate during exercise
            heartRate += 20;
        }

        public void rest() {
            // Simulating a decrease in heart rate during rest
            heartRate -= 10;
        }

        public static void main(String[] args) {
            Person person = new Person(70, 1.75);

            System.out.println("Initial weight: " + person.getWeight() + " kg");
            System.out.println("Initial height: " + person.getHeight() + " m");
            System.out.println("Initial heart rate: " + person.getHeartRate() + " bpm");

            person.exercise();
            System.out.println("Heart rate after exercise: " + person.getHeartRate() + " bpm");

            person.rest();
            System.out.println("Heart rate after rest: " + person.getHeartRate() + " bpm");

            // Calculate BMI
            System.out.println("BMI: " + person.calculateBMI());
        }
    }
}
