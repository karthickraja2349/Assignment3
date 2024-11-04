package bankBalance;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
        System.out.println("Account created for " + account.getAccountHolderName());
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
