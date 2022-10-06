public class tutorial6q6 {
    public static void main(String[] args){
        OverdraftAccount account1 = new OverdraftAccount(123, "Adam", 1000, 0.05, -10000, 0.05);
        OverdraftAccount account2 = new OverdraftAccount(124, "Brian", 30, 0.065, -5000, 0.065);
        OverdraftAccount account3 = new OverdraftAccount(125, "Christian", -100, 0.1, -2000, 0.1);
        FixedDepositAccount account4 = new FixedDepositAccount(126, "David", 100, 0.1, 3);
        System.out.println(account1 + "\n");
        System.out.println(account2 + "\n");
        System.out.println(account3 + "\n");
        System.out.println(account4 + "\n");
    }
}
