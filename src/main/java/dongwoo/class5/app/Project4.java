package dongwoo.class5.app;

public class Project4 {
    public static void main(String[] args) {
        int money=50237;
        int result = exchangeMoney(money);
        System.out.println("result = " + result);
    }

    private static int exchangeMoney(int money){
        int [] result = new int [9];

        int [] unit = {50000,10000,5000,1000,500,100,50,10,1};

        for (int i = 0; i <unit.length ; i++) {
            int[] result1 = result(unit[i], money);
            money=result1[0];

        }

            return 1;
    }

    private static int[] result(int unit, int money){
        int [] result = new int[2];

        int remainder = money / unit;
        int unitResult = money % unit;

        result[0]=remainder;
        result[1]=unitResult;

        return result;


    }

}
