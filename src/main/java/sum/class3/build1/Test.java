package sum.class3.build1;

public class Test {

//1. 왼쪽 홀수, 오른쪽 짝수 페이지가 주어진다.
//2. 왼쪽 페이지의 각 자리수의 합과 곱을 구한다.
//3. 오른쪽 페이지의 각 자리수의 합과 곱을 구한다.
//4. 합과 곱을 배열에 담아 비교하여 제일 큰 수를 꺼낸다.

    private static final int PAGES = 2;

    public static void main(String[] args) {

        // 랜덤 페이지 만들기
        int[] pages = {130, 131};

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

        for (int i = 0; i < pages.length; i++) {
            System.out.println("pages = " + pages[i]);
            System.out.println("sums = " + sums[i]);
            System.out.println("multiplies = " + multiplies[i]);
        }


        // 좌우페이지에서 가장 큰 숫자 찾기
        int[] numbers = {sums[0], sums[1], multiplies[0], multiplies[1]};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
                break;
            }
        }
        System.out.println("max = " + max);

    }
}
