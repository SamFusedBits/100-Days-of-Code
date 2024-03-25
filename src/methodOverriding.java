package src;
import java.util.Scanner;

public class methodOverriding {
    //   Simulate a game where different types of players (Warriors, Wizards, and Archers) have their own unique abilities?
    // Superclass Player
    public static class Player {

            public void attack() {
                System.out.println("Player attacks with a basic attack!");
            }

        // Subclass Warrior
        static class Warrior extends Player {
            // Override the attack method for Warriors
            @Override
            public void attack() {
                System.out.println("Warrior slashes with a sword!");
            }
        }

        // Subclass Wizard
        static class Wizard extends Player {
            // Override the attack method for Wizards
            @Override
            public void attack() {
                System.out.println("Wizard casts a powerful spell!");
            }
        }

        // Subclass Archer
        static class Archer extends Player {
            // Override the attack method for Archers
            @Override
            public void attack() {
                System.out.println("Archer shoots an arrow with precision!");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a player: 1 - Warrior, 2 - Wizard, 3 - Archer");
            int choice = scanner.nextInt();

        /*   Player player = null;

            switch (choice) {
                case 1:
                    player = new Warrior();
                    break;
                case 2:
                    player = new Wizard();
                    break;
                case 3:
                    player = new Archer();
                    break;
                default:
                    System.out.println("Invalid choice. Defaulting to Player.");
                    player = new Player();
                    break;
            } */

            //Enhanced Switch Statement
            Player player = switch (choice) {
                case 1 -> new Warrior();
                case 2 -> new Wizard();
                case 3 -> new Archer();
                default -> {
                    System.out.println("Invalid choice. Defaulting to Player.");
                    yield new Player();
                }
            };

            player.attack();

            scanner.close();
        }
    }
/* Method Overriding allows a subclass to provide a specific implementation of a method
 that is already defined in its superclass. */

                            // Day 2 of Method Overriding
//    https://www.hackerrank.com/challenges/java-method-overriding/problem?isFullScreen=true
    public class Solution {

        static class Sports {
            String getName() {
                return "Generic Sports";
            }

            void getNumberofTeamMembers() {
                System.out.println("Each team has n players in Generic Sports");
            }
        }

        static class Soccer extends Sports {
            @Override
            String getName() {
                return "Soccer Class";
            }

            int getNum() {
                return 11;
            }

            void getNumberofTeamMembers() {
                System.out.println("Each team has " + getNum() + " players in " + getName());
            }
        }

        public static void main(String[] args) {
            Sports sports = new Sports();
            Soccer soccer = new Soccer();
            System.out.println(sports.getName());
            sports.getNumberofTeamMembers();
            System.out.println(soccer.getName());
            soccer.getNumberofTeamMembers();
        }
    }

//    https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem?isFullScreen=true
        static class function{
            void functs(){
                System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
            }
        }
        static class func extends function{
            @Override
            void functs(){
                super.functs();
                System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
            }
        }

        public static void main(String[] args) {
            func functions = new func();
            functions.functs();

        }
    }
