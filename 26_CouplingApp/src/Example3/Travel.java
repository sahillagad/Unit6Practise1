package Example3;
//Dependent Class
public class Travel {

	//Dependency 
	Car car=new Car();
	
	
	public void journey() {
		System.out.println("My Travel Journey Start");
	   
		/*
		 *  Journey Function Want
		 *  the Method Of drive
		 *  Function Of Car Class
		 */
//		car.drive();
		car.Go();
		 
	}
	
	
}
