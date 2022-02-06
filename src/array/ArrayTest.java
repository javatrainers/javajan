package array;

public class ArrayTest {
	static FacebookAccount cus1=new FacebookAccount();
	static FacebookAccount cus2; // null
	
	public static void main(String[] args) {
		// group of variable declaration
		FacebookAccount[] allCustomer=new FacebookAccount[1000000];
		for(int i=0;i< allCustomer.length ;i++)
			allCustomer[i]=new FacebookAccount();
		
		for(FacebookAccount f:allCustomer)
			f=new FacebookAccount();
		// loop 1 = allCustomer[0] (first item) is stored in f variable
		// loop 2 = allCustomer[1] (second item) is stored in f variable
		// loop 1000000 = allcustomer[999999] is stored	in f variable
		
		
		FacebookAccount[][] multiDimenCus=new FacebookAccount[4][2];
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++)
				multiDimenCus[i][j]=new FacebookAccount();
		}
		
		for(FacebookAccount[] firstDimension:multiDimenCus) 
			for(FacebookAccount secondDimension:firstDimension)
				secondDimension=new FacebookAccount();
		
		
		// inline array declaration and initiazliation
		int[] scores= { 12,34,567,123,234,456 };
		for(int i:scores) {
			System.out.println(i);
		}
		// loop 1 = 12 (first item) is stored in i variable
		// loop 2 = 34 (second item) is stored in i variable
		
		
		String[] names = { "john","jane","mike"};
		FacebookAccount[] fbArr= { new FacebookAccount(),new FacebookAccount() };
		System.out.println(  scores[2] );
		System.out.println(  names[1] );
		System.out.println( fbArr[1]);
	
		int[]scores2=new int[3];
		System.arraycopy(scores, 2, scores2,0,3);
		// enhanced for loop OR for-each
		for(int i:scores2) {
			System.out.println(i);
		}
		
	}

}
