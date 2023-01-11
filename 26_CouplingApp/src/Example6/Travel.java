package Example6;
//Dependent Class
public class Travel {

	//Dependency 
	Vechicle vechicle;
	
	
	
	//Constructor Injection Point
	public Travel(Vechicle vechicle) {
		this.vechicle = vechicle;
	}




	public void journey() {
		System.out.println("My Travel Journey Start");
	   
		/*
		 *  Journey Function Want
		 *  the Method Of drive
		 *  Function Of Car Class
		 */
		 vechicle.Go();
		 
	}
	
	
}
