package dongwoo.class5.app;

public class Problem4 {
    public static void main(String[] args) {
        int money=15000;
        int[] ints = exchangeMoney(money);

        System.out.print("result = ");
        for (int intz:ints) {
            System.out.print(intz+",");
        }

    }

    private static int[] exchangeMoney(int money){
        int [] result = new int [9];

        int [] unit = {50000,10000,5000,1000,500,100,50,10,1};

        for (int i = 0; i <unit.length ; i++) {
            int[] result1 = result(unit[i], money);
            result[i]=result1[0];

            money=result1[1];

        }

            return result;
    }

    private static int[] result(int unit, int money){
//        System.out.println("unit = " + unit);
//        System.out.println("money = " + money);
        int [] result = new int[2];

        int remainder = money / unit;
//        System.out.println("remainder = " + remainder);
        int unitResult = money % unit;
//        System.out.println("unitResult = " + unitResult);

        result[0]=remainder;
        result[1]=unitResult;

        return result;


    }

}
