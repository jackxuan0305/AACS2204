import java.util.Scanner;

public class practical5Q4 {
    public static boolean checkPassword(String password){
        boolean hasLetter = false;
        boolean hasDigit = false;
        
        if(password.length() < 7){
            return false;
        }

        for(int i = 0; i < password.length(); i++){
            if(!Character.isLetterOrDigit(password.charAt(i))){
                return false;
            }
            if(Character.isLetter(password.charAt(i))){
                hasLetter = true;
            }
            if(Character.isDigit(password.charAt(i))){
                hasDigit = true;
            }
        }
        if(!hasLetter || !hasDigit){
            return false;
        }
        return true;
    }

    public static void main(String[] args){

        //checking
        System.out.println(checkPassword("1234567")?"Valid Password":"Invalid Password");
        System.out.println(checkPassword("1234567a")?"Valid Password":"Invalid Password");
        System.out.println(checkPassword("1234567A")?"Valid Password":"Invalid Password");
        System.out.println(checkPassword("1234567!")?"Valid Password":"Invalid Password");
        System.out.println(checkPassword("1234567a!")?"Valid Password":"Invalid Password");
        System.out.println(checkPassword("1234567A!")?"Valid Password":"Invalid Password");
        System.out.println(checkPassword("1234567aA")?"Valid Password":"Invalid Password");
        System.out.println(checkPassword("1234567aA!")?"Valid Password":"Invalid Password");
        System.out.println(checkPassword("1234567aA!@")?"Valid Password":"Invalid Password");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = input.nextLine();
        System.out.println(checkPassword(password)?"Valid Password":"Invalid Password");
    }
}
