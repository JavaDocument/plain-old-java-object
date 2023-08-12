package dongwoo.class5.app;

public class Problem3 {

    public static void main(String[] args) {
        String word = "I love you";

        boolean b = wordBoolean(word);

        String s = upLow(word);

        System.out.println("s = " + s);
    }
    private static boolean wordBoolean(String word){
        int length = word.length();
        if (length>=1&&length<=1000){
            return true;
        }
        return false;
    }

    private static String upLow(String words){
        String replace="";

        for (int i = 0; i <words.length() ; i++) {
            char c = words.charAt(i);
            int c1 = c;

            if(Character.isUpperCase(c)){
                int number =65 - c1 + 90;
                char newChar = (char)number ;
                 replace += newChar;
                System.out.println("replace = " + replace);

            }
            if(Character.isLowerCase(c)){
                int number = 97 - c1 + 122;
                char newChar = (char) number;
                replace += newChar;
                System.out.println("replace = " + replace);

            }
            if(!Character.isUpperCase(c)&&!Character.isLowerCase(c)){
                replace+=c;
            }

        }

        System.out.println("replace = " + replace);

        return replace;
    }

}
