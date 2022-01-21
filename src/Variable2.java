
public class Variable2 {

	public void test() {
		// create reference to other program
		VariableTest vt=new VariableTest();
		// vt is called as reference variable
		System.out.println(vt.company); // access to read
		vt.company="apple"; // access to change/write
		// to access (read/write) variable from another program
		// create reference variabel to other program
		// and use .(dot)operator
	}

}
