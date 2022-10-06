public class SavingsAccount extends Account {
    private static double interestRate = 0.05;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
    }

    public SavingsAccount() {
        super();
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        SavingsAccount.interestRate = interestRate;
    }

    public double calculateInterest() {
        return getBalance() * interestRate / 12;
    }

    public void addInterest() {
        double interest = calculateInterest();
        deposit(interest);
    }
}