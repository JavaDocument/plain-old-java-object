package com.gof.behavioral.iterator.step02;

public class CustomArrays {

    private int index = 0;
    private int[] intArrays = new int[index];
    private int currentIndex = 0;

    public void add(int number) {
        for (int i = 0; i < intArrays.length; i++) {
            intArrays[i] = number;
            index++;
        }
        if (intArrays.length <= index) {
            int size = intArrays.length + 1;
            int[] temp = new int[size];
            for (int i : temp) {
                temp[i] = intArrays[i];
            }
        }

        for (int i = 0; i < intArrays.length; i++) {
            System.out.println(intArrays[i]);
        }
//            int size = intArrays.length + 1;
//        int[] temp = new int[size]; // 이사갈집
//        for (int i : temp) {
//            temp[i] = intArrays[i];
//        }
//        return temp;
    }

    public void removeIndex(int index) {

    }

    public int size() {
        return intArrays.length;
    }
}
