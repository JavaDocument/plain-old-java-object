package dongwoo.class5.app;
//대문자 체크하기
public class Problem1 {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        StringBuffer cryptogram = buffer.append("zyelleyz");
        boolean checkLength = checkCryptogram(cryptogram);
        if (checkLength) {
            StringBuffer overlap = overlap(cryptogram);
            System.out.println("overlap = " + overlap);
        }
    }

    private static boolean checkCryptogram(StringBuffer cryptogram) {
        int length = cryptogram.length();
        System.out.println("length = " + length);
        if (length >= 1 && length <= 1000) {
            return true;
        }
        return false;
    }

    private static StringBuffer overlap(StringBuffer cryptogram) {

        int length = cryptogram.length();

            for (int s = 0; s < length; s++) {

                try {
                    char a = cryptogram.charAt(s);
                    char b = cryptogram.charAt(s + 1);

                    boolean matches = Character.toString(a).matches(Character.toString(b));

                    if (matches==true) {
                        StringBuffer delete = cryptogram.delete(s, s + 2);
                        cryptogram = delete;
                        s=0;

                        if (delete.length()==2){
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("");
                            cryptogram=stringBuffer;
                        }
                    }
                } catch (Exception e) {
                }
                System.out.println("cryptogram = " + cryptogram);
                System.out.println("----------------------------------");
            }

        return cryptogram;
    }

}