package src;

import java.util.Scanner;

public class Switch {
//    "Java Conditional Statements: if-else, switch, and Optimized Switch"
//      Basic User Identification Program
    public static void main(String[] args) {

          //Using If-else-if statements
//        System.out.println("Please, enter your name: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        if(name=="Sahil") {
//            System.out.println("Hello, Admin! Welcome to your space👋");
//        }else if(name=="Jack") {
//            System.out.println("Registered user! You can access the system🌐");
//        }else if(name=="Mack") {
//            System.out.println("Registered user! You can access the system🌐");
//        }else if(name=="John") {
//            System.out.println("You need administrative rights for accessing this system🚫");
//        }else{
//            System.out.println("You don't seem to belong to this organisation🔍");
//        }


          //Using Switch statements
//        System.out.println("Please, enter your name: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        switch (name) {
//            case "Sahil":
//                System.out.println("Hello, Admin! Welcome to your space👋");
//                break;
//            case "Jack":
//                System.out.println("Registered user! You can access the system🌐");
//                break;
//            case "Mack":
//                System.out.println("Registered user! You can access the system🌐");
//                break;                  //In case if we miss break statement here the below code will get executed too
//            case "John":
//                System.out.println("You need administrative rights for accessing this system🚫");
//                break;
//              default:
//                  System.out.println("You don't seem to belong to this organisation🔍");
//                  break;
//        }


          //Same Switch code but more optimized
//        System.out.println("Please, enter your name: ");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//
//        switch (name) {
//            case "Sahil" -> System.out.println("Hello, Admin! Welcome to your space👋");
//            case "Jack","Mack" -> System.out.println("Registered user! You can access the system🌐");
//            case "John" -> System.out.println("You need administrative rights for accessing this system🚫");
//            default -> System.out.println("You don't seem to belong to this organisation🔍");
//        }


        //Nested Switch Statements
        System.out.println("Please, enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        switch (name) {
            case "Jack":
                System.out.println("Please, enter your department number: ");
                Scanner in = new Scanner(System.in);
                int num = in.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("You're authorized into the dept! You can now access the system🌐");
                        break;
                    case 2:
                        System.out.println("You're not registered into the dept! You can't access the system🌐");
                        break;
                    default:
                        System.out.println("Enter a valid dept no.");
                        break;
            }break;
            case "John":
                System.out.println("You need administrative rights for accessing this system🚫");
                break;
            default:
                System.out.println("You don't seem to belong to this organisation🔍");
                break;
        }
    }
}

// Notes & Resources: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/tree/main/lectures/06-conditions-loops