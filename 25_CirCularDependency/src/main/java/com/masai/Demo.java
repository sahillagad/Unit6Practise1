package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
 		Object obj=ap.getBean("A");
		A a=(A)obj;
 		
		System.out.println(a);
		a.funA();
		
		
		
		
	}
}
