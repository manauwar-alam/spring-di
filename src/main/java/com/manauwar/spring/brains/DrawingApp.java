package com.manauwar.spring.brains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//		Triangle triangle_old = (Triangle) factory.getBean("triangle");
//		triangle_old.draw();
		
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Triangle_old triangle_old = (Triangle_old) context.getBean("triangle_old");
//		triangle_old.draw();
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();
		
		
		TriangleUsingList triUsingList = (TriangleUsingList) context.getBean("triangleUsingList");
		triUsingList.draw();
		
		
		//autowire example of Triangle example
		ApplicationContext context2 = new ClassPathXmlApplicationContext("spring-autowired.xml");
		Triangle triangle2 = (Triangle) context2.getBean("triangle");
		triangle2.draw();
		
		
	}

}
