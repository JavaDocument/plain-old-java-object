package sum.class5.app;

public class Problem1 {

    public static void main(String[] args) {
        String str = "zyelleyz";
        // 같은 문자열이 있으면 삭제

        // apple -> a--le
        // [0] substring(0,i)
        // [1][2] 삭제
        // [3][4] substring(i+2)

        // cco -> --o
        // [0][1] 삭제 substring(0,i)
        // [2] substring(i+2)
        char a = ' ';
        char b = ' ';
        do {
            for (int i = 0; i < str.length() - 1; i++) {
                a = str.charAt(i);
                b = str.charAt(i + 1);
                if (a == b) {
                    str = str.substring(0, i) + str.substring(i + 2);
                    break;
                }
            }
        } while (a == b);
        System.out.println(str);
    }
}
