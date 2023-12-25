package com.gof.chap01.adapter.step02;

class MultiplicationTable {
    private static final int START_NUMBER = 1;
    private static final int END_NUMBER = 9;
    private final String[] list;

    public MultiplicationTable(int number) {
        this.list = new String[END_NUMBER];
        initialize(number);
    }

    private void initialize(int number) {
        for (int i = START_NUMBER; i <= END_NUMBER; i++) {
            list[i - START_NUMBER] = number + " * " + number + " = " + (number * i) + System.lineSeparator();
        }
    }

    public String[] getList() {
        return list;
    }

}
