package com.gof.behavioral.iterator.step02;

class DragonArrays implements CustomIterator<Dragon> {

    private Dragon[] dragonArrays = new Dragon[3];
    private int index = 0;
    private int currentIndex = 0;

    public void addDragon(Dragon dragon) {
        dragonArrays[index++] = dragon;
        if (index >= dragonArrays.length) {
            Dragon[] temp = new Dragon[dragonArrays.length * 2];
            for (int i = 0; i < dragonArrays.length; i++) {
                temp[i] = dragonArrays[i];
            }
            this.dragonArrays = temp;
        }
    }

    @Override
    public boolean hasNext() {
        return index > currentIndex;
    }

    @Override
    public Dragon getNext() {
        if (hasNext()) {
            return this.dragonArrays[currentIndex++];
        }
        return null;
    }
}
