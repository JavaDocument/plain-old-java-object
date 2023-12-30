package com.gof._etc.index;

import java.util.Arrays;

class MyArray {

    int arr[] = new int[3];
    int index = 0;
    int currentIndex = 0;

    public int[] add(int num) {
        arr[index++] = num;
        if (index >= arr.length) {
            int[] temp = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            this.arr = temp;
        }
        arr[currentIndex++] = num;
        return this.arr;
    }

    public int[] removeIndex(int num) {
        if (currentIndex > num) {
            int[] temp = new int[arr.length];
            for (int i = 0; i < num; i++) {
                temp[i] = arr[i];
            }
            for (int i = num + 1; i < arr.length; i++) {
                temp[i - 1] = arr[i];
            }
            this.arr = temp;
        } else {
            System.out.println("존재하지 않는 인덱스");
        }
        currentIndex--;
        index--;
        return this.arr;
    }

    public int[] pop() {
        int[] temp = new int[arr.length];
        for (int i = 0; i < currentIndex - 1; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        currentIndex--;
        index--;
        return this.arr;

    }

    public void size() {
        System.out.println(currentIndex);
    }

    @Override
    public String toString() {
        return "MyIndex{" +
                "arr=" + Arrays.toString(arr) +
                ", index=" + index +
                ", currentIndex=" + currentIndex +
                '}';
    }
}
