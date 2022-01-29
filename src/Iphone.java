
public class Iphone {
	// assets = global variable, methods
	String screen="touchscreen";
	int keypad=10;
	public Iphone() {
		System.out.println("constructing grandparent");
	}
	public void call() {
		System.out.println("make phone call");
	}
	public void text() {
		System.out.println("send text");
	}
}
