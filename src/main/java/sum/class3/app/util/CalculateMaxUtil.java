package sum.class3.app.util;

public class CalculateMaxUtil {

    private static final int PAGES = 2;

    public static int calculateMax(int leftPage, int rightPage) {

        int[] pages = {leftPage, rightPage};

        // 좌우페이지의 합과 곱
        int[] sums = new int[PAGES];
        int[] multiplies = new int[PAGES];

        for (int i = 0; i < pages.length; i++) {
            int page = pages[i];

            int sum = 0;
            int mul = 1;

            while (page > 0) {
                int digit = page % 10;
                sum += digit;
                mul *= digit;
                page /= 10;
            }
            sums[i] = sum;
            multiplies[i] = mul;
        }


        // 좌우페이지에서 가장 큰 숫자
        int[] numbers = {sums[0], sums[1], multiplies[0], multiplies[1]};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("🎯 가장 큰 수: " + max);

        return max;
    }
}
