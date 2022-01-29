
// Iphone5 = child class, sub class
// Iphone3 = parent class, super class
public class Iphone5 extends Iphone3{
	public Iphone5() {
		super();
		System.out.println("constructing child");
	}
	
	public void maps() {
		System.out.println("geo directions");
	}
}
