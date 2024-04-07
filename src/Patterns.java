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

                                    //Day2 of Patterns

    public static class XSquarePattern {
        public static void main(String[] args) {
            int size = 5;

            // upper triangle
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size; j++) {
                    if (j == i || j == size - i + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

            // lower triangle
            for (int i = size - 1; i >= 1; i--) {
                for (int j = 1; j <= size; j++) {
                    if (j == i || j == size - i + 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    public static class PascalTriangle {
        public static void main(String[] args) {
            int rows = 5;

            for (int i = 0; i < rows; i++) {
                int number = 1;
                System.out.printf("%" + (rows - i) * 2 + "s", "");
                for (int j = 0; j <= i; j++) {
                    System.out.printf("%4d", number);
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }
}