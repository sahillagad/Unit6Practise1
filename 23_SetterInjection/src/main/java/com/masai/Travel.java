package com.masai;

public class Travel {

	
	
	Vechicle vechicle;
   Integer NoOfPerson;
	
	public void setVechicle(Vechicle vechicle) {
		this.vechicle = vechicle;
	}
	
	
	public void setNoOfPerson(Integer noOfPerson) {
		NoOfPerson = noOfPerson;
	}


	public void Jounrny() {
		
		System.out.println("I am inside the Travel class");
		vechicle.Go();
		System.err.println("I am Travel With "+NoOfPerson+" Friend ");
		
	}
	
}
