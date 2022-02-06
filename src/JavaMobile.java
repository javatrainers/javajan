// implement = giving solution
// 				writing code
public class JavaMobile 
implements IMobile,IDataPlan{
	// if you inherit incomplete methods
	// this programs itself will be considered
	// incomplete
	// override required if both parents have 2 ambigious default methods
	public void payment() {
		System.out.println("my own payment code");
	}
	public void call() {
		System.out.println("making calls");
	}
	public void text() {
		System.out.println("sending text");
	}
	public void browse() {
		System.out.println("internet browsing");
	}
}
