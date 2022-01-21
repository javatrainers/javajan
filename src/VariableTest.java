
public class VariableTest {
	// global variable
	String company="amazon";
	
	public void test() {
		// access variable
		// read and changing variable
		System.out.println(company); // access to read
		company="apple"; // access to change/write
	}
	
	
	static Address add; // default value for complex/object data type
						//			is null/nothing
	static int weight;	// gets default value					
							// parametric / input variable
	public static void main(String[] args) {
		int height; // do not get default values
		System.out.println(weight);
		System.out.println(add);
		//System.out.println(height);
		// local variables
		int age=20; // declare and initialize
		// Ouput code
		// System.out.println = print value of age variable on console
		System.out.println(  age );
		int a; // declaration 
		a=20; // initialization = storing value for FIRST time
		a=30; // assignment/reassignment = overwrite previous value with new value
		System.out.println( a );
		// = assignment operator
		// assign RHS (Right hand Side) value to LHS variable
		int x=50;
		System.out.println( x );
		x=a; // value of a (30) assigned to LHS variable
		System.out.println( x );
		
		// RULES on assignment operator ( = )
		/*
		 LHS should always be a variable
		 RHS can be literal value of SAME type as LHS variable
		  					OR 
		 RHS can be another variable of SAME type as LHS variable
		 */
		String s="john";
		int y=10;
		int z=y;
		 
		
		
	}

}
