package Example4;
//Dependent Class
public class Travel {

//Dependency 
//	Car car=new Car();
//If We want Change Dependency than WE Want Again Touch 
// the Dependent Class
	Bike bike=new Bike();
	
	
	
	public void journey() {
		System.out.println("My Travel Journey Start");
	   
		/*
		 *  Journey Function Want
		 *  the Method Of drive
		 *  Function Of Car Class
		 */
//		car.drive();
		bike.ride();
		
		 
	}
	
	
}
