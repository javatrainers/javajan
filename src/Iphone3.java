
public class Iphone3 extends Iphone{
	int x=20; // parent/super variable
	public Iphone3() { // parent/super constructor
		super();
		System.out.println("constructing parent");
	}
	
	public void camera() {//parent /super method
		System.out.println("take pictures");
	}
}
