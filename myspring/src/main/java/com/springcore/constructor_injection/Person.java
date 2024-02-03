package com.springcore.constructor_injection;

public class Person {
    private String name;
    private String id;
    private Certificate cf; 

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
            ", cf='" + getCf() + "'" +
            "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Certificate getCf() {
        return this.cf;
    }

    public void setCf(Certificate cf) {
        this.cf = cf;
    }

    public Person() {
    }

    public Person(String name, String id, Certificate cf) {
        this.name = name;
        this.id = id;
        this.cf = cf;
    }

}
