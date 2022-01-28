import java.util.Scanner;

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
		
		for( int i=0; i < 4 ; i++){
			System.out.println("hello");
			if(i==2){
				break;
			}
			System.out.println("hi");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("add to cart ? true/false");
		boolean add2Cart=sc.nextBoolean();
		while(add2Cart) {
			System.out.println("added item to cart");
			System.out.println("add another item to cart ? true/false");
			add2Cart=sc.nextBoolean();
		}
		
		boolean atmTran=false;
		do{
			System.out.println("ATM transaction processed");
			System.out.println("do you have any other request ? true/false");
			atmTran=sc.nextBoolean();
		}while(atmTran);
		
		
		
	}

}
