package Example5;
//Dependency class
public class Bike implements Vechicle{

	public void ride() {
		System.out.println("Bike Is Start...");
	}

	@Override
	public void Go() {
	
		ride();
	}
	
}
