package com.masai;


public class Bike implements Vechicle{

	public void ride() {
		
		System.out.println("I am Inside the ride Method Of Bike Class");
	}
	
	@Override
	public void Go() {
		ride();
		
	}
	
}
