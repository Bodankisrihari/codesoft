import java.util.Scanner;

public class ATMinterface{
    private static double balance = 1000; // Starting balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATMinterface");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Select an option:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Invalid. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance in account is: $"+balance);
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient amount.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance is: $" + balance);
        }
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid amount.Please Try again");
        } else {
            balance += amount;
            System.out.println("Deposit successful.Here is the New balance: $" + balance);
        }
    }
}
