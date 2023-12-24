package kimjiseung97.class5.app;

public class question2 {
    public static void main(String[] args) {
        int number = 33;

        int result = solution(number);
        System.out.println(result);
    }

    public static int solution(int number) {
        int clapCount = 0;

        for (int i = 1; i <= number; i++) {
            int currentNum = i;
            int digitCount = 0; // 3, 6, 9의 개수를 세는 변수

            while (currentNum > 0) {
                int digit = currentNum % 10;
                if (digit == 3 || digit == 6 || digit == 9) {
                    digitCount++;
                }
                currentNum /= 10;
            }

            clapCount += digitCount; // 손뼉 횟수 누적
        }

        return clapCount;
    }
}
