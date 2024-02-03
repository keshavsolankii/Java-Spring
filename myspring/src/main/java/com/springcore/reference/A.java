package com.springcore.reference;

public class A {
    private int x;
    private B obj;

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getObj() {
        return this.obj;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "{" +
            " x='" + getX() + "'" +
            ", obj='" + getObj() + "'" +
            "}";
    }

    public A() {
    }

}
