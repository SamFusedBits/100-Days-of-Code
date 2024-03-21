package src;

public class Interface {
    /* An interface in Java is like a blueprint of a class. It defines a set of methods
    that a class must implement. However, unlike classes, interfaces cannot contain implementation code.
    They only declare the methods that implementing classes must define.
    Syntax: Declare with package statement at the top of source files.
    Accessing Classes: Use import statement to access classes/interfaces from other packages.

    interface MyInterface {
        void method1();
        int method2(String str);
    } */

    interface Shape {
        double calculateArea();
    }

    static class Rectangle implements Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double calculateArea() {
            return length * width;
        }
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

        public static void main(String[] args) {
            Shape rectangle = new Rectangle(5, 3);
            Shape circle = new Circle(4);


            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
            System.out.println("Area of Circle: " + circle.calculateArea());
        }
    }


    /*Packages in Java:
    Definition: Packages in Java are used to organize classes and interfaces into namespaces, which helps in avoiding naming conflicts and makes code more manageable.

    Creating Packages:
    package mypackage; // Declaring package name at the beginning of the file

    Accessing Classes in Packages:
    import mypackage.MyClass; // Importing a specific class
    import mypackage.*; // Importing all classes in the package
*/
