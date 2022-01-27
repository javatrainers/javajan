
public class ControlFlowTest {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		boolean c=true;
		// statement should end with semicolon
		if( a==b ){
			System.out.println("they are same");
		}
		// comments :  else cannot exist without if
		// no code should be written between if and else block
		else{
			System.out.println("they are different");
		}
		
		
		
		int p=100;
		int q=50;
		if( p==q ){
			System.out.println(" p and q are same ");
		}
			
		
		int x=5;
		if(x==1) {
			System.out.println("x is 1");
		}
		else if(x==2) {
			System.out.println("x is 2");
		}
		else if(x==3) {
			System.out.println("x is 3");
		}
		else if(x==4) {
			System.out.println("x is 4");
		}
		else { // default block
			System.out.println("x is unknown");
		}
		System.out.println("bye bye");
		
	}

}
