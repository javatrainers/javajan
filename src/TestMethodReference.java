
public class TestMethodReference {

	public static void main(String[] args) {
		TestPerson tp=new TestPerson();
		Person p=new Person();
		int a=20;
		System.out.println( a );
		System.out.println( p.name );
		
		tp.method1( a,p);
		
		System.out.println( a );
		System.out.println( p.name );
		
	}

}
