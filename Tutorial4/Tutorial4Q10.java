package Tutorial4;
//Tutorial4Q10.java
import java.util.Scanner;

public class Tutorial4Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account acc1 = new Account(909, "Ali Baba", 1000);
        int choice;

        do {
            System.out.println("Main Menu");
            System.out.println("1 : Check balance");
            System.out.println("2 : Cash In");
            System.out.println("3 : Cash Out");
            System.out.println("4 : Interest");
            System.out.println("5 : Exit");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Your balance :RM %.2f\n", acc1.getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount you want to cash in : ");
                    double amount = input.nextDouble();
                    acc1.cashIn(amount);
                    System.out.printf("Your current balance :RM %.2f\n", acc1.getBalance());
                    break;

                case 3:
                    System.out.print("Enter amount you want to cash out: ");
                    amount = input.nextDouble();
                    acc1.cashOut(amount);
                    System.out.printf("Your current balance :RM %.2f\n", acc1.getBalance());
                    break;

                case 4:
                    System.out.printf("Your interest :RM %.2f\n", acc1.calculateInterest());
                    break;

                case 5:
                    System.out.println("Exit");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 5);
    }

}
