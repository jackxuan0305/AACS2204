import java.util.Scanner;

public class practical6q1 {
    public static void main(String[] args) {
        
        CurrentAccount currentAccount = new CurrentAccount("123456789", 1000, 3, 0);
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Check Number of Transactions");
            System.out.println("5. Check Transaction Fee");
            System.out.println("6. Check interest rate");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double amount = scanner.nextDouble();
                    currentAccount.deposit(amount);
                    currentAccount.incrementTransactionsCount();
                    if (currentAccount.getTransactionsCount() > currentAccount.getFreeTransactions()) {
                        currentAccount.deductTransactionFee();
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    if (currentAccount.withdrawal(amount)) {
                        currentAccount.incrementTransactionsCount();
                        if (currentAccount.getTransactionsCount() > currentAccount.getFreeTransactions()) {
                            currentAccount.deductTransactionFee();
                        }
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 3:
                    System.out.println("Balance: " + currentAccount.getBalance());
                    break;
                case 4:
                    System.out.println("Number of transactions: " + currentAccount.getTransactionsCount());
                    break;
                case 5:
                    System.out.println("Transaction fee: " + currentAccount.getTransactionFee());
                    break;
                case 6:
                    //System.out.println("Interest rate: " + SavingsAccount.getInterestRate());
                    break;
                case 7:
                    System.out.println("Thank you for using our service.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}