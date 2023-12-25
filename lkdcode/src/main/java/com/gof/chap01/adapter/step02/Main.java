package com.gof.chap01.adapter.step02;

class Main {

    public static void main(String[] args) {
        MyProjectApplication myProjectApplication = new MyProjectApplication();
        MyAdapter myAdapter = new MyAdapter();
        MultiplicationTable multiplicationTable = new MultiplicationTable(8);

        String[] list = multiplicationTable.getList();

        for (String table : list) {
            int result = myAdapter.changeExecute(table);
            myProjectApplication.print(result);
        }
    }

}
