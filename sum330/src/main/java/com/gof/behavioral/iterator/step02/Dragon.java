package com.gof.behavioral.iterator.step02;

class Dragon {

    private String name;
    private Gender gender;

    public Dragon(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
