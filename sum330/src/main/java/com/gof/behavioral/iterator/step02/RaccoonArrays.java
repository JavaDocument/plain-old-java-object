package com.gof.behavioral.iterator.step02;

import java.util.Arrays;

public class RaccoonArrays implements CustomIterator<Raccoon> {

    private Raccoon[] raccoonArrays = new Raccoon[10];
    private int index = 0; // 3
    private int hasIndex = 0; // 3

    public void addRaccoon(Raccoon raccoon) { // 배열에 라쿤 추가
        if (raccoonArrays.length <= index) {
            this.raccoonArrays = Arrays.copyOf(raccoonArrays, raccoonArrays.length * 2);
        }
        raccoonArrays[index] = raccoon; // 배열[0] = 라쿤0
        index++; // 배열[1] = 라쿤1, 배열[2] = 라쿤2
    }

    @Override
    public boolean hasNext() {
        // 배열의 현재 위치보다 찾아야하는 인덱스가 작으면 트루
        // 같거나 크면 펄스
        if (index > hasIndex) {
            return true;
        }

        return false;
    }

    @Override
    public Raccoon getNext() {
        if (!hasNext()) {
            return null;
        }

        return raccoonArrays[hasIndex++];
    }

}
