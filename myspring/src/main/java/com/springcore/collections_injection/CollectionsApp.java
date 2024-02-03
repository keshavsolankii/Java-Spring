package com.springcore.collections_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collections_config.xml");
        Emp employee = (Emp) context.getBean("emp1");
        System.out.println(employee);
    }
}
