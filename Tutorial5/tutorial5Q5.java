public class tutorial5Q5 {
    public static boolean validCreditCardNum(String num){
        if (num.length() != 16){
            return false;
        }
        for (int i = 0; i < num.length(); i++){
            if (!Character.isDigit(num.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(validCreditCardNum("1234567890123456"));
        System.out.println(validCreditCardNum("123456789012345"));
        System.out.println(validCreditCardNum("123456789012345a"));
    }
}
