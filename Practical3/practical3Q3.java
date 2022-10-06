public class practical3Q3 {
    public static void main(String[] args) {
        int[][] money = {
                { 100, 26 },
                { 50, 87 },
                { 20, 96 },
                { 10, 0 },
                { 5, 33 },
                { 1, 145 }
        };

        int sum = 0;

        System.out.printf("%-20s %-10s %s\n", "Denomination (RM)", "Quantity", "Value (RM)");

        for (int i = 0; i < money.length; i++) {

            sum += money[i][0] * money[i][1];
            
            if (money[i][0] * money[i][1] != 0) {
                System.out.printf("%13d %12d %10d\n", money[i][0], money[i][1], money[i][0] * money[i][1]);
            }
        }
        System.out.printf("\nTotal = RM %d\n", sum);
    }
}
