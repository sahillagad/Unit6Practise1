package IS_A_Relationship;

public class B extends A{


	
public void funB() {
	System.err.println("This Function Called By the FunB of B class"); 
	funA();
	

}

public void funC() {
	System.err.println("This Function Called By the FunC of B class"); 

	funA();

}
	
}
