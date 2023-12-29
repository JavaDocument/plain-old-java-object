package com.gof.chap02.builder.step01;

class MyHome {
    private final String name;
    private final String address;
    private final Integer door;
    private final Integer post;

    private MyHome(String name, String address, Integer door, Integer post) {
        this.name = name;
        this.address = address;
        this.door = door;
        this.post = post;
    }

    static class Builder {
        private String name;
        private String address;
        private Integer door;
        private Integer post;

        Builder name(String name) {
            this.name = name;
            return this;
        }

        Builder address(String address) {
            this.address = address;
            return this;
        }

        Builder door(Integer door) {
            this.door = door;
            return this;
        }

        Builder post(Integer post) {
            this.post = post;
            return this;
        }

        MyHome build() {
            return new MyHome(this.name, this.address, this.door, this.post);
        }
    }

    @Override
    public String toString() {
        return "MyHome{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", door=" + door +
                ", post=" + post +
                '}';
    }
}
