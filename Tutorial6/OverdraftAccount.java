public class OverdraftAccount extends Account {
    private String accountType;
    private double overdraftLimit;
    private double overdraftInterestRate;

    public OverdraftAccount(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate, double overdraftLimit, double overdraftInterestRate) {
        super(accountNo, accountHolderName, accountBalance, annualInterestRate);
        if(accountBalance >= 10000 || overdraftInterestRate <= 0.05){
            this.accountType = "Premium";
        }
        else if(accountBalance >= 5000 || overdraftInterestRate <= 0.065){
            this.accountType = "Gold";
        }
        else{
            this.accountType = "Silver";
        }
        this.overdraftLimit = overdraftLimit;
        this.overdraftInterestRate = overdraftInterestRate;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftInterestRate() {
        return overdraftInterestRate;
    }

    public void setOverdraftInterestRate(double overdraftInterestRate) {
        this.overdraftInterestRate = overdraftInterestRate;
    }

    public void cashOut(double cash) {
        if(cash <= this.overdraftLimit){
            super.cashOut(cash);
        }
        else{
            System.out.println("You can't withdraw more than the overdraft limit");
        }
    }

    public double calculateInterest() {
        return super.getAccountBalance() * this.overdraftInterestRate;
    }

    public String toString() {
        return super.toString() + "Account Type: " + this.accountType + "\nOverdraft Limit: " + this.overdraftLimit
                + "\nOverdraft Interest Rate: " + this.overdraftInterestRate;
    }

}
