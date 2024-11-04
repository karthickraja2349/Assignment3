package bankBalance;
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Successfully deposited %.2f. New balance: %.2f%n", amount, balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal of " + amount);
        }
        balance -= amount;
        System.out.printf("Successfully withdrew %.2f. New balance: %.2f%n", amount, balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
