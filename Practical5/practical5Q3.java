public class practical5Q3 {

    public static String wishChristmas(String str){
        String surName = "";
        String name = "";
        String checkName = "";
        String callName = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '['){
                for(int j = i + 1; j < str.length(); j++){
                    if(str.charAt(j) == ']'){
                        surName = str.substring(i + 1, j);
                        checkName += surName;
                        surName = Character.toUpperCase(surName.charAt(0)) + surName.substring(1).toLowerCase();
                        name += surName;
                        //System.out.println(name);
                        break;
                    }
                }
            }
        }

        if (str.contains("[" + checkName + "]")){
            str = str.replace("[" + checkName + "]", name);
            str = str.replace("  ", " ");
            str = Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == ' '){
                    str = str.substring(0, i + 1) + Character.toUpperCase(str.charAt(i + 1)) + str.substring(i + 2);
                }
            }
            if(str.endsWith("Mr")){
                callName = "Mr";
            }
            else{
                callName = "Ms";
            }
            str = str.replace(callName, "");
            //System.out.println(str);
        }

        String string = "";
        string += "To: " + str + "\n";
        string += "Wishing you a Merry Christmas, " + callName + " " + name + ".";
        return string;
    }
    public static void main(String[] args){
        System.out.println(wishChristmas("Main [Nicholas] charaTer Mr"));
        System.out.println(wishChristmas("pETER [RYAN] Robbin Mr"));
        System.out.println(wishChristmas("JOHN [SMITH] Mr"));
        System.out.println(wishChristmas("[Chee] ky li Ms"));
    }
}
