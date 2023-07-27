package jefeel.class3.app.domain.input;


import java.util.ArrayList;
import java.util.List;


public class PlayerInputList {

    private final List<Integer> list;


    public PlayerInputList() {
        list = new ArrayList<>();
    }

    public void addNumber(int first, int second) {
        list.add(first);
        list.add(second);
    }

    public int getIndex(int i) {
        return list.get(i);
    }

    public void setNumber(int index, int result) {
        list.set(index, result);
    }

    @Override
    public String toString() {
        return list.toString();
    }


}
