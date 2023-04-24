package com.cg1;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String[] args) {
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml"); 
		Triangle triange=(Triangle) factory.getBean("triangle");
		triange.method();
		System.out.println(triange.getHeight());
	}
}
