package com.masai;

public class Car implements Vechicle{

	

	public void start() {
		
		System.out.println("I am Inside the ride Method Of Bike Class");
	}

	@Override
	public void Go() {
		start();
		
	}
	
	
	
}
