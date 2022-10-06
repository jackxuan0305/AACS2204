import java.lang.Math;

public class tutorial2 {

    public static boolean leapYear(int year) {
        final int GREGORIAN = 1582;
        boolean beforeGregorian = year < GREGORIAN;

        if (year % 4 == 0) {
            if (beforeGregorian) {
                return true;
            } else {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
    }

    public class pay {
        public static double computeNetPay(int hours, double payRate, double tax) {
            double grossPay = hours * payRate;
            double netPay = grossPay - (grossPay * tax);
            return netPay;
        }

        public static double computeNetPay(int hours, double payRate) {
            final double TAX = 0.15;
            double grossPay = hours * payRate;
            double netPay = grossPay - (grossPay * TAX);
            return netPay;
        }

        public static double computeNetPay(int hours) {
            final double PAY_RATE = 10.00;
            final double TAX = 0.15;
            double grossPay = hours * PAY_RATE;
            double netPay = grossPay - (grossPay * TAX);
            return netPay;
        }
    }

    public static void main(String[] args) {
        final int ALL = 20;
        int num = 0;
        double sum = 0;
        double sumSquare = 0;

        for(int i = 0; i < ALL; i++){
            num = Math.round((float)Math.random( )*100);
            System.out.println("Marks = " + num);
            sum += num;
            sumSquare += Math.pow(num, 2);
        }

        double mean = sum / ALL;
        double standardDeviation = Math.sqrt((sumSquare - (Math.pow(sum, 2) / ALL)) / (ALL - 1));
        System.out.println("Mean              : " + mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}