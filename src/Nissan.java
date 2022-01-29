
public class Nissan extends Vehicale{
	// runtime polymorphsm = Overriding
	public void drive() {
		System.out.println("economy drive");
	}
	// compile time polymorphism = overloading
	public void drive(String s) {
		System.out.println("normal drive");
	}
	
	public void start(String s) {
		
	}
	
	
}
