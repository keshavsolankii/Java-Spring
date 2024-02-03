package com.springcore.constructor_injection;

public class Certificate {
    private int id;
    private String certiName;

    public Certificate(int id, String certiName) {
        this.id = id;
        this.certiName = certiName;
    }
    
    public Certificate() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCertiName() {
        return this.certiName;
    }

    public void setCertiName(String certiName) {
        this.certiName = certiName;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", certiName='" + getCertiName() + "'" +
            "}";
    }
}