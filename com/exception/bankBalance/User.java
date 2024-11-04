package bankBalance;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        
        BankAccount account1 = new BankAccount("123456", "Alice", 1000.00);
        BankAccount account2 = new BankAccount("654321", "Bob", 500.00);
        
        bank.addAccount(account1);
        bank.addAccount(account2);

        while (true) {
            System.out.println("\nOptions: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 4) {
                break;
            }

            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            BankAccount account = bank.getAccount(accountNumber);

            if (account == null) {
                System.out.println("Account not found.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.printf("Current balance: %.2f%n", account.getBalance());
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the bank system.");
    }
}

