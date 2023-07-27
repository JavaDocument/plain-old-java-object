package qwr.class1.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
            public static void main(String[] args) throws IOException {
                String[] input;
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                int i = Integer.parseInt(br.readLine());
                System.out.println("값을 입력하세요: " + i);
                input = br.readLine().split(" ");
                br.close();

                List<Integer> pobi = Arrays.asList(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
                List<Integer> crong = Arrays.asList(Integer.parseInt(input[2]), Integer.parseInt(input[3]));


                // Run the tests
                int result1 = Problem.solution(pobi, crong);

                // Print the results
                System.out.println("Result 1: " + result1);
            }
        }
