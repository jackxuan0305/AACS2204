import java.util.Scanner;

public class practical3Q1 {

    public static void main(String[] args){
        //Q1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of quiz scores to process: ");
        int numScores = input.nextInt();

        int[] scores = new int[numScores];

        int sum = 0;
        System.out.printf("\n");
        for (int i = 0; i < scores.length; i++){
            System.out.printf("Score %d: ", i + 1);
            scores[i] = input.nextInt();

            sum += scores[i];
        }

        float average = (float)sum / (float)scores.length;
        int count = 0;
        int belowAverage = 0;

        for (int i = 0; i < scores.length; i++){
            if(scores[i] >= average){
                count++;
            }
            else{
                belowAverage++;
            }
        }

        System.out.println("\nResults");
        System.out.println("=======");
        System.out.println("Average is " + average);
        System.out.println("Number of scores above or equal to the average is " + count);
        System.out.println("Number of scores below the average is " + belowAverage);
    }
}
