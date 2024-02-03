package com.springcore.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CiMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor_config.xml");
        Person psn1 = (Person) context.getBean("person1");
        System.out.println(psn1);
        Person psn2 = (Person) context.getBean("person2");
        System.out.println(psn2);
    }
}
