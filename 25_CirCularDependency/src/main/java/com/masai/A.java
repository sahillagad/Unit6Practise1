package com.masai;

public class A {

	
	private B b;
	
	
	public A(B b) {
		super();
		this.b = b;
	}


	public void funA() {
		
		System.out.println("I am Inside The A class Of FunA() Method");
	      System.out.println("B address "+b);
	}
	
}
