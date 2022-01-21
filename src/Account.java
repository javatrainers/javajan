
public class Account {
	// variables
	int balance; // global variable
	String name;
	
	// Method declaration
	// int = return type..... float = parameter
	public int deposit( float amount) { 
		// method definition or method body or method block
		
		// accessing global variable from same program
		System.out.println( balance ); // direct access
		// access methods from same program
		int x=20;
		int y=30;
		String z="john";
		int result=add(x,z,y);// pass x and y. same type as input a and b
		// ().. passing input
		/*
		 	1) number of inputs should match
		 	2) data type should match
		 	3) order should also match
		 */
		/*
		 return type handling
		 store result from method call in same type
		 */
		return 100; // return statement
	}
	
	public int add(int a,String c, int b) {
		return 10;
	}
	
	// method declaration
	// contract = obligation to give/return 
	// an integer output
	public int checkBalance( ) {
		return 1123123;
	}
	
	// method declaration
	// contract = obligation to the user to provde a number
	// obligation to return an boolean output
	public boolean withdraw( int amount) {
		return false;
	}
	
	public void	donation(int amount) {
	 
	}
	// return type= primitive, simple data type
	// EITHER return ANY value that matches the output
	// OR any VARIABLE that matches the output
	public int areaOfRectangle(int length, int breadth) {
		boolean a=true;
		float b=10.0f;
		int c=123;
		String d="john";
		//return 1000;
		return c; // return statement
	}
	// return type = complex/ Object data type
	// ANY variale that matche the output
	public Address getAddress(String custName) {
		Address abc=new Address();
		return abc;
	}
	
	
	
	
	
	
	
	
	
}
