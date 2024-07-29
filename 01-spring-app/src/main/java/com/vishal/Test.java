package com.vishal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Engine e =cxt.getBean(Engine.class);
		e.start();
		

	}

}
