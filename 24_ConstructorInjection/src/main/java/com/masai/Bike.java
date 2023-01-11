package com.masai;

public class Bike implements Vechical{

	public void bike() {
		
		System.out.println("Start Bike ");
	}
	
	@Override
	public void Go() {
		bike();
		
	}
}
