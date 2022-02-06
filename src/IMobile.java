// binding contract or agreement
// abstract or incomplete program or method
// represents ABSTRACTION oops concept
// end customers of your product will be using this program
public abstract interface IMobile {
	
	// variable store information
	int a=10; // final/constant/unchangeable 
	
	// methods change/manipulate above information
	// it is change from within method body
	// but without method body in interface methods
	// there is no possibility of change. 
	// that makes variable unchangeable
	public abstract void call();
	public abstract void text();
	public default void payment() {
		System.out.println("pay by apple pay");
	}
}
