package com.springcore.constructor_injection;

public class Person {
    private String name;
    private String id;

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", id='" + getId() + "'" +
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

    public Person() {
    }

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
