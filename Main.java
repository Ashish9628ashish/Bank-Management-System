import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter holder name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter initial deposit: ");
                    double amount = sc.nextDouble();

                    bank.createAccount(name, amount);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    long depositAccount = sc.nextLong();

                    System.out.print("Enter amount: ");
                    double depositAmount = sc.nextDouble();

                    bank.deposit(depositAccount, depositAmount);
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    long withdrawAccount = sc.nextLong();

                    System.out.print("Enter amount: ");
                    double withdrawAmount = sc.nextDouble();

                    bank.withdraw(withdrawAccount, withdrawAmount);
                    break;

                case 4:
                    System.out.print("Enter account number: ");
                    long balanceAccount = sc.nextLong();

                    bank.checkBalance(balanceAccount);
                    break;

                case 5:
                    System.out.print("Enter account number: ");
                    long detailAccount = sc.nextLong();

                    bank.showAccount(detailAccount);
                    break;

                case 6:
                    System.out.println("Thank you for using our bank!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}