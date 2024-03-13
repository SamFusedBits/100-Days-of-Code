package src;

public class Lib_mgmt_system {
    //Library Management System

    static class Library {
        private String bookName;
        private int copiesAvailable;

        Library(String bookName, int copiesAvailable) {
            this.bookName = bookName;
            this.copiesAvailable = copiesAvailable;
        }

        void borrowBook(int copiesToBorrow) {
            if (copiesToBorrow <= copiesAvailable) {
                copiesAvailable -= copiesToBorrow;
                System.out.println(copiesToBorrow + " copies of '" + bookName + "' borrowed successfully.");
            } else {
                System.out.println("Sorry, only " + copiesAvailable + " copies of '" + bookName + "' available.");
            }
        }
    }

    static class Member {
        private String name;

        Member(String name) {
            this.name = name;
        }

        void borrowBook(Library library, int copiesToBorrow) {
            library.borrowBook(copiesToBorrow);
            System.out.println(name + " borrowed " + copiesToBorrow + " copies of '" + library.bookName + "'.");
        }
    }

    public static void main(String[] args) {
        Library book1 = new Library("Java Programming", 5);
        Member member1 = new Member("Sahil");

        // Sahil borrows 3 copies of "Java Programming" book
        member1.borrowBook(book1, 3);
    }
}