
public class Operators {

	public static void main(String[] args) {
		int a = 30;
		int b = 30;
		int c = a + b;
		int d = a - b;
		int e = a * b;
		int f = a / b;
		int g = a % b; // modulos .. remainder
		String s = "john";
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

		// is A equal to B
		boolean res = (a == b);
		System.out.println(res);

		int x = 20;
		int y = 10;
		// is X greater than y
		boolean res2 = (x >= y);
		System.out.println(res2);

		int z = -10;
		int p = -z;
		System.out.println(+(-10));

		int r = 10;
		// post = incre/decr at the end of the line
		// pre = incre/decr at the begining of the line

		// r=11
		System.out.println(++r); // print 11

		System.out.println(r++);// print 11
		// r=12
		// r=11
		System.out.println(--r);// print 11
		// r=12
		System.out.println(++r);// print 12

		System.out.println(r--);// print 12
		// r=11

		int k = 10;
		int l = 20;

		System.out.println( k==l && k < l);
		//false or true
		//true
		System.out.println( 5 & 4 );
		System.out.println( 6 | 4 );
		System.out.println( 7 ^ 8 );
		
		System.out.println(   10 + 5 * 2 - (6 + 4) > 10 + 20 * 30 || 20 + 30 > 10 );
		
		
	}

}
