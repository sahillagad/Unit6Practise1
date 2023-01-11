package Example1;

public class Bike implements Vechical {

	public static void ride() {
		
		System.out.println("Journey Start With Bike");
		
		
	}

	@Override
	public void go() {

		 ride();
		
	}
	
	
}
