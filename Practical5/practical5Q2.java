import java.util.Scanner;

public class practical5Q2 {

    public static String modifyString(String str){
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                newStr += 'x';
            }
            else{
                newStr += Character.toUpperCase(str.charAt(i));
            }
        }
        return newStr;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        System.out.println("Modified string: " + modifyString(str));
    }
}
