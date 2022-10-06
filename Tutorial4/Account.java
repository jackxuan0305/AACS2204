package Tutorial4;
//Account.java
public class Account {
    
    //Q10c
    private int accountNo;
    private String accountHolderName;
    private double balance;
    private int accountCount;
    private double annualInterestRate;

    public Account(int accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        accountCount++;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountCount() {
        return accountCount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public void cashIn(double amount) {
        balance += amount;
    }

    public void cashOut(double amount) {
        balance -= amount;
    }

    public double calculateInterest() {
        return balance * annualInterestRate;
    }
}
