package src;

public class DataAbstraction {

    public static class BankAccount {
        private double balance; // Data hiding: The balance is private and cannot be accessed directly from outside the class.
        // (Data Hiding is hiding internal data from outside users. The internal data should not go directly that is outside person/classes is not able to access internal data directly. It is achieved by using an access specifier- a private modifier.)

        // Constructor to initialize the balance
        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + " deposited successfully.");
            } else {
                System.out.println("Invalid amount for deposit.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(amount + " withdrawn successfully.");
            } else {
                System.out.println("Invalid amount for withdrawal or insufficient balance.");
            }
        }

        // Method to get the current balance (abstraction: users don't need to know how balance is stored or calculated)
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            BankAccount account = new BankAccount(1000);
            System.out.println("Initial balance: " + account.getBalance());

            account.deposit(500);
            System.out.println("Balance after deposit: " + account.getBalance());

            account.withdraw(200);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            account.withdraw(2000); // Attempt to withdraw more than balance
        }
    }
}
