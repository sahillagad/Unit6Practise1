package Example1;

public class Travel extends Car{

	
	Vechical vechical;
	
	//Setter Injection Point
	public void setVechical(Vechical vechical) {
		this.vechical = vechical;
	} 
	
	
	public void journey() {
		
		System.out.println("Hello My Name Is sahil & I am ");
		vechical.go();
	}	
}
