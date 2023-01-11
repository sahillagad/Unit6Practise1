package com.masai;

public class Travel {

	
	
private	Vechicle vechicle;
private Integer NoOfPerson;
	


	public Travel(Vechicle vechicle, Integer noOfPerson) {
	this.vechicle = vechicle;
	this.NoOfPerson = noOfPerson;
}



	public void Jounrny() {
		
		System.out.println("I am inside the Travel class");
		vechicle.Go();

		
	}
	
}
