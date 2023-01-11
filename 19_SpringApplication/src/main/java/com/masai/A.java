package com.masai;

public class A {

	
	Integer x;
	B b;

	public void setX(Integer x) {
		this.x = x;
	}

	public void setB(B b) {
		this.b = b;
	}

	public void funA() {
		// TODO Auto-generated method stub

		System.out.println("Indside the FunA Of A Class");
		System.out.println("x = "+x);
		System.out.println("b = "+b);
		b.funB();
	}
	
	
}
