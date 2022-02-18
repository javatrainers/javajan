package Collec;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Vector;

public class TestCollection {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String> ();
	 	names.add("john");
	 	names.add("jane");
	 	names.add("mike");
	 	names.add("john");
	 	// for-each.. enchanced for loop
	 	for(String s:names) {
	 		System.out.println(s);
	 	}
	 	Iterator<String> iter=names.iterator();
	 	while(iter.hasNext()) {
	 		System.out.println(iter.next());
	 	}
		System.out.println("***********");
		
		
		
		
		
		
		String[] cart=new String[3];
		cart[0]="iphone";
		cart[2]="fire tablet";
		System.out.println(cart[0]);
		System.out.println(cart[1]);
		System.out.println(cart[2]);
		
		names.add("john");
		names.add("jane");
		names.add("mike");
		names.add("andy");
		System.out.println(names);
		names.add(1,"ron");
		System.out.println(names);
		
		names.remove("jane");
		System.out.println(  names.get(1));
		names.remove("mike");
		System.out.println(names);
		System.out.println(  names.get(1));
		
		TreeSet<String> cities=new TreeSet<String>();
		cities.add("london");
		cities.add("paris");
		cities.add("new york");
		cities.add("san jose");
		cities.add("london");
		System.out.println(cities);
	}

}
