public class exam {
    // 1bi
    boolean x;

    public static void main(String[] args) {
        exam a = new exam();
        System.out.println(a.x);

        // 1bii
        int[][] array = new int[5][6];
        int[] x = { 1, 2 };
        array[0] = x;
        System.out.println("array[0][1] is " + array[0][1]);
    }

    // 1ci
    public static double commission(double sales, double rate) {
        return sales * rate;
    }

    // 1cii
    public static String printMonth(int month, int year) {
        return String.format("%d/%d", month, year);
    }

    // 1ciii
    public static double sqrt(double x) {
        return Math.sqrt(x);
    }

    // 1civ
    public static boolean evenNum(double x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 1cv
    public static int appearNumTime(String message, int num) {
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == num) {
                count++;
            }
        }
        return count;
    }

    // idi
    // 1 public class Errors {
    // 2 public static void main(String[] args) {
    // 3 Errors t = new ShowErrors(5);
    // 4 }
    // 5 }

    // line 3: using wrong class name when creating new object

    // idii
    // 1 public class ShowErrors {
    // 2 public static void main(String[] args) {
    // 3 ShowErrors t = new ShowErrors();
    // 4 t.x();
    // 5 }
    // 6 }

    // line 4: x() method undefined
}
