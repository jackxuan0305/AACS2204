import java.lang.Math;

public class practical2 {

    //Q3
    public static double inchToCentimeter(double in){
        double centimeter = in * 2.54;
        return centimeter;
    }

    public static double centimeterToInch(double cm){
        double inches = cm / 2.54;
        return inches;
    }

    //Q4
    public class Average{
        public static int calculateAverage(int a, int b){
            int average = (a + b) / 2;
            return average;
        }

        public static int calculateAverage(int a, int b, int c){
            int average = (a + b + c) / 3;
            return average;
        }

        public static double calculateAverage(double a, double b){
            double average = (a + b) / 2;
            return average;
        }
        public static double calculateAverage(double a, double b, double c){
            double average = (a + b + c) / 3;
            return average;
        }
    }
    public static void main(String[] args){

        //Q1
        System.out.println("Number     SquareRoot");
        for(int i = 0; i <= 20; i += 2){
            double result = Math.sqrt(i);
            System.out.printf("%-10d %.4f\n", i, result);
        }

        //Q2
        double upperLimit = 0, lowerLimit = 0;
        double squareMidPoint, midPoint;

        int num = 20;

        if (num > 1){
            lowerLimit = 1;
            upperLimit = num;
        }

        do{
            midPoint = (upperLimit + lowerLimit) / 2;
            squareMidPoint = midPoint * midPoint;
            if(squareMidPoint > num){
                upperLimit = midPoint;
            }
            else{
                lowerLimit = midPoint;
            }

            //System.out.printf("midpoint=%f  squareMidpoint=%f upperLimit=%f lowerLimit=%f upperLimit/lowerLimit=%f\n"
            //, midPoint, squareMidPoint, upperLimit, lowerLimit, upperLimit/lowerLimit);
        }while (upperLimit - lowerLimit > 0.0000000001);
        //}while(Math.abs(upperLimit - lowerLimit) > 0.00001);
        System.out.printf("The square root of %d is %f\n", num, midPoint);

        //Q3
        System.out.printf("%-10s %-20s %-15s %s\n", "Inches", "Centimeters", "Centimeter", "Inches");
        for(int i = 0; i <= 10; i ++){
            double in = 0;
            double cm = 0;
            in = i + 1;
            cm = (i + 1) * 5;
            System.out.printf("%-10.1f %-20.2f %-15.1f %.2f\n"
            , in, inchToCentimeter(in), cm, centimeterToInch(cm));
        }

        //Q4
        System.out.println(Average.calculateAverage(2, 3));
        System.out.println(Average.calculateAverage(2, 3, 4));
        System.out.println(Average.calculateAverage(2.5, 3.5));
        System.out.println(Average.calculateAverage(2.5, 3.5, 4.5));

    }
}
