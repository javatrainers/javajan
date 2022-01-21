
public class TestPerson {
	public void method1(int x, Person p1) {
		x=30;
		method2(x,p1);
		p1.name="jane";
		
	}

	public void method2(int y, Person p2) {
		y=40;
		method3(y,p2);
		p2.name="mike";
	}

	public void method3(int z, Person p3) {
		z=50;
		p3.name="andy";
	}
}
