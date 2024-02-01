package com.gof.chap06.chain_of_responsibilty.exam;

public class Com {
    private String name = "mac";


    public Com(String name) {
        this.name = name;
    }

    public void print() {
        String name1 = this.name;

        Com com = new Com("ㅎㅎ");
        String name2 = com.name;

        // name1 = mac
        // name2 = ㅎㅎ
    }
}
