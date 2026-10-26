import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();
    private long nextAccountNumber = 1001;

    public void createAccount(String name, double initialDeposit) {

        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid name!");
            return;
        }

        if (initialDeposit < 0) {
            System.out.println("Invalid initial deposit!");
            return;
        }

        Account account = new Account(
                nextAccountNumber++, name, initialDeposit
        );

        accounts.add(account);

        System.out.println("Account created successfully!");
        System.out.println("Your Account Number: "
                + account.getAccountNumber());
    }

    public Account findAccount(long accountNumber) {

        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    public void deposit(long accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void withdraw(long accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void checkBalance(long accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            System.out.println("Current Balance: Rs. "
                    + account.getBalance());
        } else {
            System.out.println("Account not found!");
        }
    }

    public void showAccount(long accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.displayDetails();
        } else {
            System.out.println("Account not found!");
        }
    }
}