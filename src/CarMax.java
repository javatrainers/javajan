import java.util.Scanner;

public class CarMax {

	public static void main(String[] args) {
		
		Nissan nn=new Nissan();
		nn.drive("john");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for basic, 2 for ecomony,3 for luxury, 4 for fast cars");
		int option=sc.nextInt();
		if(option == 1) {
			Vehicale v=new Vehicale();
			testDrive(v);
		}
		if(option == 2) {
			Nissan n=new Nissan();
			testDrive(n);
		}
		if(option == 3) {
			Lexus l=new Lexus ();
			testDrive(l);
		}
		if(option == 4) {
			Ferrari f=new Ferrari();
			testDrive(f);
		}
	}
	public static void testDrive(Vehicale v) {
		v.drive();
	}

}
