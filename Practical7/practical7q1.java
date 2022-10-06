public class practical7q1 {

    public static double computeTotalCollection(PatientBill[] bills) {
        double totalCollection = 0;

        for (int i = 0; i < bills.length; i++) {
            totalCollection += bills[i].calculateTotalCharges();
        }

        return totalCollection;
    }

    public static PatientBill[] selectionSort(PatientBill[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            int indexOfSmallest = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j].compareTo(arr[indexOfSmallest]) < 0) {
                    indexOfSmallest = j;
                }
            }
            
            PatientBill tempArr = arr[indexOfSmallest];
            arr[indexOfSmallest] = arr[i];
            arr[i] = tempArr;
        }
        return arr;
    }

    public static void main(String[] args) {
        PatientBill[] bills = {
                new InpatientBill("Thiam Wei", 200.00, 100.00, "P", 5),
                new InpatientBill("Wee kiat", 300.00, 150.00, "S", 2),
                new OutpatientBill("Nicholas", 2000),
                new OutpatientBill("Kehlehfair", 1200),
        };

        for (int i = 0; i < bills.length; i++) {

            System.out.print(bills[i].toString());
            System.out.println("Total Charges : " +
                    bills[i].calculateTotalCharges() + "\n");
        }

        System.out.println("Total collection : " +
                computeTotalCollection(bills));
    }
}