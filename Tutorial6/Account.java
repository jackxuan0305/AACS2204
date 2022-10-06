public class Account {
    private int accountNo;
    private String accountHolderName;
    private double accountBalance;
    private double annualInterestRate;

    public Account(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void cashIn(double cash){
        this.accountBalance += cash;
    }

    public void cashOut(double cash){
        this.accountBalance -= cash;
    }

    public double calculateInterest(){
        return this.accountBalance * this.annualInterestRate / 100;
    }

    public String toString(){
        String string = "";
        string += "Account Number: " + this.accountNo + "\n";
        string += "Account Holder Name: " + this.accountHolderName + "\n";
        string += "Account Balance: " + this.accountBalance + "\n";
        return string;
    }
}
