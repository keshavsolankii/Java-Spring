package com.springcore.reference;

public class B {
    private int y;

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public B() {

    }

    @Override
    public String toString() {
        return "{" +
            " y='" + getY() + "'" +
            "}";
    }
}
