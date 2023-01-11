package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.masai");
	Object  obj= applicationContext.getBean("messageProcessorImpl");	

	MessageProcessorImpl mPI=(MessageProcessorImpl) obj;
	
	System.out.println(mPI);
	mPI.processMessage("How are You");
		
		
	}
}
