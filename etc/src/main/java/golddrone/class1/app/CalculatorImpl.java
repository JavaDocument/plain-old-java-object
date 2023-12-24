package golddrone.class1.app;

import java.security.Key;
import java.util.Scanner;

public class CalculatorImpl implements Calculator {

    private static Keyboard keyboard;
    private static Screen screen;

    /**
     * keyboard, screen 초기화
     */
    public CalculatorImpl() {
        keyboard = KeyboardImpl.getInstance();
        screen = new ScreenImpl();
    }


    /**
     * 계산기 로직을 실행하는 메서드
     * 중복 제
     */
    @Override
    public void run() {
        System.out.println("first integer input");
        Long firstInteger = keyboard.button();
        System.out.println("second integer input");
        Long secondInteger = keyboard.button();
        Long result = addition(firstInteger, secondInteger);
        screen.output(result);
    }

    /**
     * 좌항과 우항을 더해 결과를 출력하는 메서드
     * 가독성을 생각하기
     *
     * @param firstInteger  좌항 정수
     * @param secondInteger 우항 정수
     * @return 결과는 좌항 + 우항 Long 타입으로 반환
     */
    @Override
    public Long addition(Long firstInteger, Long secondInteger) {
        if(firstInteger == null || secondInteger == null) return 0L;
        return firstInteger + secondInteger;
    }


}
