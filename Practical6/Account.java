import java.util.Date;

public class Account {
    private String accountNumber;
    private double balance;
    private Date dateCreated;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public Account() {
        this.dateCreated = new Date();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean withdrawal(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}