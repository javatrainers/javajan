package exceptin;

import java.io.File;
import java.io.IOException;

public class Test {
	int as=-123123123;
	public void method1() {
		System.out.println("in method 1");
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void method2()throws IOException{
		System.out.println("in method 2");
		method3();
	}
	public void method3()throws IOException     {
		System.out.println("in method 3");
		int i=5/1;
		method4();
	}
	public void method4() throws IOException {
		System.out.println("in method 4");
		File f = new File("c:/file.txt");
		// WILL FAIL
		f.createNewFile();
		
	}
}
