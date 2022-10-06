import java.util.Scanner;

public class practical5Q1 {

    public static int countLetter(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        System.out.print("Enter the letter you want to count: ");
        char letter = input.nextLine().charAt(0);
        System.out.println(word + " contains " + countLetter(word, letter) + " " + letter);

    }

}