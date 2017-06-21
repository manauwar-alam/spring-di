package com.manauwar.spring.testbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        BeanFactory factory = context;
        MySpringBeanWithDependency test = (MySpringBeanWithDependency) factory
                .getBean("mySpringBeanWithDependency");
        test.run();
    }
}