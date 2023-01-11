package HAS_A_Relationship;

public class B {

	A a=new A();
	
public void funB() {
	System.out.println("This Function Called By the FunB of B class"); 
	a.funA();
	

}

public void funC() {
	System.out.println("This Function Called By the FunC of B class"); 

	a.funA();

}
	
}
