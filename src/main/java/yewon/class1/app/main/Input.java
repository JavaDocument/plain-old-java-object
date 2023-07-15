//package yewon.class1.app.main;
//
//import lombok.SneakyThrows;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//import static yewon.class1.app.main.Output.message;
//
//// 사용자에게 값을 입력받는 클래스
//public class Input {
//
//    // 값을 직접 입력받아 리턴하는 역할
//    public static int inputNumber() {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int inputNumber;
//        do {
//            inputNumber = validateNumber(br);
//            if (inputNumber == 0) {
//                message("정수를 입력해주세요.\n정수 입력: ");
//            }
//        } while (inputNumber == 0);
//        return inputNumber;
//    }
//
//    // 입력받은 값을 검증하는 역할
//    private static int validateNumber(BufferedReader br) {
//        try {
//            return Integer.parseInt(br.readLine());
//        } catch (NumberFormatException | NullPointerException e) {
//            return 0;
//        } catch (IOException e) {
//            message("입력 에러: " + e.getMessage());
//            return 0;
//        }
//    }
//
//}
