public class tutorial5Q4{
    public static boolean validLibrarianName(String name){
        if (name.length() < 6){
            return false;
        }
        for (int i = 0; i < name.length(); i++){
            if (name.indexOf(" ") == 1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(validLibrarianName("Nicholas"));
        System.out.println(validLibrarianName("Thiam Wei"));
        System.out.println(validLibrarianName("Kuean"));
    }
}