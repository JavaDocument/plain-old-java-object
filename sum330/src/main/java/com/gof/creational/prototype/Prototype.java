package com.gof.creational.prototype;

class Prototype implements Cloneable {

    private String property;

    public Prototype(String property) {
        this.property = property;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getProperty() {
        return property;
    }

    public void setPrototype(String property) {
        this.property = property;
    }
}
