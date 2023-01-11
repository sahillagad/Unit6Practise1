package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext  context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Object obj= context.getBean("Travel");
		Travel travel=(Travel) obj;
		
		
		System.out.println(travel);
		travel.Jounrny();
		
		Object obj1=context.getBean("Travel1");
		Travel travel2=(Travel)obj1;
		System.out.println(travel2);
		travel2.Jounrny();
		
		
		
	}
}
