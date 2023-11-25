package golddrone.class5.problem1;

public class Main {

    public static String solution(String cryptogram){
        String result = "";
        int cnt;
       outer : while (true){

           cnt = 0;
           for (int i = 0; i < cryptogram.length()-1; i++) {
                if(cryptogram.charAt(i) == cryptogram.charAt(i+1)){
                    cryptogram = cryptogram.substring(0, i)
                            + cryptogram.substring(i+2);
                    cnt++;
                }
           }
           if(cnt==0) {
               result = cryptogram;
               break outer;
           }
       }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(solution("browoanoommnaon"));
    }
}
