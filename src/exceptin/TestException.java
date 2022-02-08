package exceptin;

import java.io.File;
import java.io.IOException;

import array.FacebookAccount;

public class TestException {

	static FacebookAccount cus1 = new FacebookAccount();
	static FacebookAccount cus2;

	public static void main(String[] args) {
		// System.out.println(cus1.addr.buildingNumber);

		// runtime = Unchecked exception
		// compile time = Checked exception
		// Suspect Error prone code..
		
		
		try {
			Bank b=new Bank();
			b.withdraw(30);
			b.withdraw(120);
			
			System.out.println("1");
			System.out.println("2");
			// WILL FAIL
			int a = 10 / 0; // UNCHECKED / RUNTIME EXCEPTION

			String[] names = new String[2];
			// WILL FAIL
			names[5] = "john"; // UNCHECKED / RUNTIME EXCEPTION
			System.out.println("3");
			// Create text file in hard drive location below

			File f = new File("c:/file.txt");
			// WILL FAIL
			f.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ArithmeticException ar) {
			ar.printStackTrace();
		} catch (RuntimeException re) {
			re.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
