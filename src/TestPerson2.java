
public class TestPerson2 {
	public void method1() {
		method2();
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method2");
		method3();
	}

	public void method3() {
		System.out.println("method3");
	}
}
