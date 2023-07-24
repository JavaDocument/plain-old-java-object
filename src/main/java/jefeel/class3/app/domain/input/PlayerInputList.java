package jefeel.class3.app.domain.input;


import java.util.ArrayList;
import java.util.List;


public class PlayerInputList<T>{

    private List<T> list;

    public PlayerInputList() {
        list = new ArrayList<>();
    }

    public void addNumber(T number){
        list.add(number);
    }



}
