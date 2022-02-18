package Collec;

import java.util.*;


public class CollectionTest {

	public static void main(String[] args) {
		 	HashSet<String> names=new HashSet<String> ();
		 	names.add("john");
		 	names.add("jane");
		 	names.add("john");
		 	names.add("mike");
		 	System.out.println(names);
		 	names.remove("jane");
		 	System.out.println(names);
		 	
		 //	per.add("john");
		 	System.out.println("**********");
		 	ArrayList<String> se=new ArrayList<String> ();
		 	se.add("john");
		 	se.add("jane");
		 	se.add("john");
		 	se.add("mike");
		 	se.remove("mike");
		 	System.out.println(se);
		 	
	}
}