package staticpackage;
public class Test {
	public static void main(String[] args) {
		
		
		System.out.println(ChaseBankAccount.bankName);
		ChaseBankAccount.test1();	
		
		
		ChaseBankAccount cust1=new ChaseBankAccount ("john",12345);	
		ChaseBankAccount cust2=new ChaseBankAccount ("jane",12346);	
		
		ChaseBankAccount.bankName="abcd";		
		System.out.println( cust1.bankName);		
		System.out.println( cust2.bankName);				
		cust1.name="mike";		
		System.out.println( cust1.name);		
		System.out.println( cust2.name);		

	}

}
