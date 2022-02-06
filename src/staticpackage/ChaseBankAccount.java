package staticpackage;

public class ChaseBankAccount {
	static String bankName = "Chase"; // shared with all ChaseBankAccount instances
	String name;// instance variable specific to every instance/copy of ChaseBankAccount
	int accountNumber;
	// If method has contact with non-static members
	// the method should be non-static as well.
	public void deposit() {
		Calculator.add(100, 10);
	}
	public void withdraw() {
		Calculator.sub(100, 5);
	}
	public static void test1() {
		System.out.println(bankName);
	}
	public void test2() {
		System.out.println(name);
	}
	// utility method
	public static void test3() {
		System.out.println("hi:");
	}
	public void test4() {
		test2();
	}
	public ChaseBankAccount(String n, int a) {
		name = n;
		accountNumber = a;
	}
}
