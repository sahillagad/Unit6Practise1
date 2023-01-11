package Example6;
//Dependency class
public class Car implements Vechicle{

	
	public void drive() {
		
		System.out.println("Car Is Start...");
	}

	@Override
	public void Go() {
      
	drive();
		
	}
	
	
}
