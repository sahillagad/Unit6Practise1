package com.masai;

public class Travel {

	
	Vechicle vechicle;

	public void setVechicle(Vechicle vechicle) {
		this.vechicle = vechicle;
	}
	
	
	public void Jounrny() {
		
		System.out.println("I am inside the Travel class");
		vechicle.Go();
		
	}
	
}
