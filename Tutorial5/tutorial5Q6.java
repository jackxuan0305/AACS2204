public class tutorial5Q6 {

    public static boolean validateID(String loginID) {
        if (loginID.length() < 6 || loginID.length() > 10) {
            System.out.println(1);
            return false;
        }
        for (int i = 0; i < loginID.length(); i++) {
            if (i == 0) {
                if (!Character.isUpperCase(loginID.charAt(i))) {
                    System.out.println(2);
                    return false;
                }
            }
            //Consists of only letters and digits
            if (!Character.isLetter(loginID.charAt(i))) { //weird
                System.out.println(3);
                return false;
            }

            //Contains at least one lowercase letter
            if (Character.isLowerCase(loginID.charAt(i))) { //weird
                System.out.println(4);
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validateID("Nicholas12"));
        System.out.println(validateID("ETHAN123"));
        System.out.println(validateID("shawn123"));
        System.out.println(validateID("1231231231"));
        System.out.println(validateID("ThiamWei"));
        System.out.println(validateID("Kuean456"));
    }
}
