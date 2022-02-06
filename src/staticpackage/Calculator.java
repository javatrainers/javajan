package staticpackage;

public class Calculator {
	
	// THERE ARE NO GLOBAL VARIABLE (STATIC OR NON-STATIC)
	// If method has contact with non-static members
	// the method should be non-static as well.

	// static methods are utility purpose, because they can be used by other
	// programs for different reasons.
	public static final int add(int a,int b) {
		return a+b;
	}
	public static final int sub(int a,int b) {
		return a-b;
	}
	public static final int mul(int a,int b) {
		return a*b;
	}
	public static final int div(int a,int b) {
		return a/b;
	}
	
}
