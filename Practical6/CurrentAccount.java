public class CurrentAccount extends Account {
    private static int freeTransactions = 3;
    private static double transactionFee = 2.00;
    private int transactionsCount;

    public CurrentAccount(String accountNumber, double balance, int freeTransactions, int transactionsCount) {
        super(accountNumber, balance);
        this.transactionsCount = 0;
    }

    public CurrentAccount() {
        super();
    }

    public int getFreeTransactions() {
        return freeTransactions;
    }

    public void setFreeTransactions(int freeTransactions) {
        CurrentAccount.freeTransactions = freeTransactions;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        CurrentAccount.transactionFee = transactionFee;
    }

    public int getTransactionsCount() {
        return transactionsCount;
    }

    public void setTransactionsCount(int transactionsCount) {
        this.transactionsCount = transactionsCount;
    }

    public void incrementTransactionsCount() {
        this.transactionsCount++;
    }

    public void deductTransactionFee() {
            withdrawal(transactionFee);
    }
}
