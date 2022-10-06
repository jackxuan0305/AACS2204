public class test {
    public static boolean checkPassword(String password){
        if(password.length() < 8){
            return false;
        }

        boolean hasDigit = false;
        for(int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))){
                hasDigit = true;
                break;
            }
        }

        boolean upperCase = false;
        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))){
                upperCase = true;
                break;
            }
        }

        boolean lowerCase = false;
        for(int i = 0; i < password.length(); i++){
            if(Character.isLowerCase(password.charAt(i))){
                lowerCase = true;
                break;
            }
        }

        if(hasDigit && upperCase && lowerCase){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(checkPassword("12345678"));
        System.out.println(checkPassword("Wayne123"));
        System.out.println(checkPassword("wayne123"));
        System.out.println(checkPassword("Wayne"));
    }
}
