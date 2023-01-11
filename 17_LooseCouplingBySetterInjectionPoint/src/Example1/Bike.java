package Example1;

public class Bike implements Vechical {

	//Ride method name change tnan Only We change In the Dependency Class
	public static void ride1() {
		
		System.out.println("Journey Start With Bike");
		
		
	}

	@Override
	public void go() {

		 ride1();
		
	}
	
	
}
