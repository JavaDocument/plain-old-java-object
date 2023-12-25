package com.gof.chap01.singleton.step01;

public class DragonToothless {

    private static DragonToothless toothless;

    private DragonToothless() {
        System.out.println("세상에 하나뿐인 투슬리스 생성!");
    }

    public static DragonToothless getToothless() {
        if (toothless == null) {
            toothless = new DragonToothless();
        }
        return toothless;
    }
}
