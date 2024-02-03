package com.springcore.collections_injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;
    private Properties props;

    public Emp() {
    }

    public Emp(String name, List<String> phones, Set<String> addresses, Map<String,String> courses, Properties props) {
        this.name = name;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
        this.props = props;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", phones='" + getPhones() + "'" +
            ", addresses='" + getAddresses() + "'" +
            ", courses='" + getCourses() + "'" +
            ", props='" + getProps() + "'" +
            "}";
    }

    public Properties getProps() {
        return this.props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public Set<String> getAddresses() {
        return this.addresses;
    }

    public void setAddresses(Set<String> addresses) {
        this.addresses = addresses;
    }

    public Map<String,String> getCourses() {
        return this.courses;
    }

    public void setCourses(Map<String,String> courses) {
        this.courses = courses;
    }

}
