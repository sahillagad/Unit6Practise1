package Example1;
//Dependent class
public class B {

//	dependency
	A a=new A();
	
	
	public void funB() {
		
		System.out.println("I am Inside The B class inside the funB ");
		a.funA();
	}

	public void funC() {
		
		System.out.println("I am Inside The B class inside the funC ");
		a.funA();
	}
}

/*
B class Is  Dependent class it dependent  on the A class
B Will Be Dependent On A

*/