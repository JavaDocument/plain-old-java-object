package dongwoo.class5.app;

public class Problem2 {
    public static void main(String[] args) {

        int number=13;
        char[] checkNumber =new char[3];
        checkNumber[0]='3';
        checkNumber[1]='6';
        checkNumber[2]='9';

        boolean b = checkNumber(number);

        if(b==true) {
           int clapResult = countClap(checkNumber, number);
            System.out.println("clapResult = " + clapResult);
        }
    }

    private static boolean checkNumber(int number) {

        if(number>=1&&number<=10000){
            return true;
        }
        return false;
    }

    private static int countClap(char[] checkNumber, int number){

        int clapCount=0;
        for (int i = 0; i <checkNumber.length; i++) {

            for (int j = 1; j <=number ; j++) {
                String stringNumber = String.valueOf(j);
                char[] charArray = stringNumber.toCharArray();
                int length = charArray.length;
                System.out.println("length = " + length);
                for (int k = 0; k <length ; k++) {
                    char c = charArray[k];
                    System.out.println("c = " + c);
                    if (checkNumber[i]==c){

                        clapCount++;
                        System.out.println("clapCount = " + clapCount);
                    }
                }


            }
            System.out.println("true 한바퀴 --------------------------");

        }
        return clapCount;
    }

}
