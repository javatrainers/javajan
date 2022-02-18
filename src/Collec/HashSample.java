package Collec;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashSample {

	public  static void main(String ags[])
	{
		System.out.println("\n \n \n");
		//LinkedHashMap<String, Integer> studentPercent =new LinkedHashMap<String, Integer>();
		//HashMap<String, Integer> studentPercent =new HashMap<String, Integer>();
		//TreeMap<String, Integer> studentPercent =new TreeMap<String, Integer>();
		Hashtable<String, Integer> studentPercent =new Hashtable<String, Integer>();
		studentPercent.put("john", 65);
		studentPercent.put("jane", 95);
		studentPercent.put("mike", 35);
		studentPercent.put("john", 85);
		
		// get size of hash
		int studentSize=studentPercent.size();
		System.out.println("hash : number of students :"+studentSize);
		
		// remove an items from hash by key
		studentPercent.remove("bharat");
		studentSize=studentPercent.size();
		System.out.println("after removing bharat. hash : number of students :"+studentSize);
		
		// get value by key
		int percent=studentPercent.get("john");
		System.out.println("bharat score is "+percent);
		// check if key exists 
		if(studentPercent.containsKey("mike"))
		{
			System.out.println("student mike exists");
		}else
			System.out.println("student mike doesnt exists");

		// check if value exists 
		if(studentPercent.contains(65))
		{
			System.out.println("student scored 65");
		}
		
		// get all the keys from hashmap 
		Set<String> keySet=studentPercent.keySet();
		for(String key:keySet)	
		{	
			System.out.println(key);
			System.out.println(studentPercent.get(key) );
		}	

		
		
	}
}
