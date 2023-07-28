package qwr.class3.app;

import qwr.class3.app.Problem;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Integer> pobiCase1 = Arrays.asList(97, 98);
        List<Integer> crongCase1 = Arrays.asList(197, 198);

        List<Integer> pobiCase2 = Arrays.asList(131, 132);
        List<Integer> crongCase2 = Arrays.asList(211, 212);

        List<Integer> pobiCase3 = Arrays.asList(99, 102);
        List<Integer> crongCase3 = Arrays.asList(211, 212);

        List<Integer> pobiCase4 = Arrays.asList(401, 402);
        List<Integer> crongCase4 = Arrays.asList(1, 2);

        // Run the tests
        int result1 = Problem.solution(pobiCase1, crongCase1);
        int result2 = Problem.solution(pobiCase2, crongCase2);
        int result3 = Problem.solution(pobiCase3, crongCase3);
        int result4 = Problem.solution(pobiCase4, crongCase4);

        // Print the results
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
    }
}
//public class Main {
//            public static void main(String[] args) throws IOException {
//                String[] input;
//                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//                int i = Integer.parseInt(br.readLine());
//                System.out.println("값을 입력하세요: " + i);
//                input = br.readLine().split(" ");
//                br.close();
//
//                List<Integer> pobi = Arrays.asList(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
//                List<Integer> crong = Arrays.asList(Integer.parseInt(input[2]), Integer.parseInt(input[3]));
//
//
//                // Run the tests
//                int result1 = Problem.solution(pobi, crong);
//
//                // Print the results
//                System.out.println("Result 1: " + result1);
//            }
//        }
