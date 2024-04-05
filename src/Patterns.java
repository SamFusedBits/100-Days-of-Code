package src;

public class Patterns {

    public static class diamondPattern {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 5; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static class rightAlignedTrianglePattern {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 4; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    public static class numberPattern {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

}
