package golddrone.class5.problem2;

public class Main {

    public static int solution(int number) {
        int result = 0;


        for (int i = 1; i <= number; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='3' ||
                        s.charAt(j)=='6' ||
                        s.charAt(j)=='9') {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(33));
    }
}
