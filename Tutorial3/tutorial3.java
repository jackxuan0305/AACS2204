public class tutorial3 {

    //Q5
    public static void fillWithRandomNumbers(double[] values) {

        for (int i = 0; i < values.length; i++){
            values[i] = Math.random();
        }
    }

    //Q6
    public static int returnAverage(int[] values) {

        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum / values.length;
    }

    //Q7
    public static int returnLargest(int[] values) {

        int largest = values[0];
        for (int i : values) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        // Q3
        double[] r = new double[100];

        for (double i : r){
            i = Math.random() * 100;
            System.out.println(i);
        }

    }
}
