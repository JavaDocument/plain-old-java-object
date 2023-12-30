package com.gof._etc.index;

class App {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.add(10);
        myArray.add(33);
        myArray.add(11);
        myArray.add(5);
        myArray.add(30);
        myArray.removeIndex(1);
        myArray.pop();
        myArray.size();

        String string = myArray.toString();
        System.out.println(string);
    }
}
