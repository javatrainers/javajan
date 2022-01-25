
public class Person {

	// global variables = Long Term information
		// instance variable
		String name="john";	
		// static/shared variable
		static String speices="humans";
		int x; // default values provided = 0 for integer
		int age=20;
		
	// parametric variable = input variables = short term information
	public void greet(String message) {
		String age="young";
		System.out.println( age ); // local wins when conflict
		System.out.println(this.age);// global variable 
		
		//int message=10; local variable cant have conflict with paramter
		//int age=20; local variable cant have conflit with other local variable
		
		int y; // default values NOT provided
		System.out.println( x );
		//System.out.println( y );
		
		System.out.println(name);
		System.out.println(message);
		// local variables		
		int a=10;
		
		//System.out.println( q ); // print q
		//nested blocks
		{
			//System.out.println( q ); // print q
			int p=20;
			// line # where it was created = 24 declaration line 
			// end of its block = 28 go up and look for opening bracket
			{int q=30;
				{
					System.out.println( q ); // print q
				}
			}
		}
		//System.out.println(q  ); // print q
	}
	
	public void testing() {
		System.out.println(name);
		System.out.println(message);
		System.out.println(a);
	}
}
