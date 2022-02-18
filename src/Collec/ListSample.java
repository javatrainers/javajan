package Collec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ListSample {


	public void listStudents()
	{
		Student s=new Student(1,"jane");
		int i=10;// not have method or variabels
		System.out.println( i   );
		System.out.println( s );
		
		// wrapper data type 
		// class/complex data type version of primitive
		// byte = Byte, short=Short,int=Integer, long=Long,
		// float = Float, double=Double, boolean = Booleam
		// char= Character
		ArrayList<Integer> score=new ArrayList<Integer>();
		score.add(10);
		score.add(20);
		score.add(50);
		score.add(30);
		
		
		
		
		
		System.out.println("\n \n \n");
		// List has 3 types - arraylist,linkedlist and vector.
		LinkedList<String> studentsCollection=new LinkedList<String> ();
		//LinkedList<String> studentsCollection=new LinkedList<String> ();
		//Vector<String> studentsCollection=new Vector<String> ();
		
		// add items to list collection
		studentsCollection.add("ram");
		studentsCollection.add("shyam");
		studentsCollection.add("laxman");
		studentsCollection.add("laxman");
		
		// get size of list collection 
		int no_of_students=studentsCollection.size();
		System.out.println("List number of students:"+no_of_students);
		
		// get item from specific index ( not part of set collection )
		String firstStudent=studentsCollection.get(0);
		System.out.println("List first student:"+firstStudent);
		
		// set item at specific index ( not part of set collection )
		studentsCollection.set(2, "bharat");

		// find the items index ( not part of set collection )
		int itemNo=studentsCollection.indexOf("ram");
		System.out.println("List find index of an item:"+itemNo);
		
		// remove an item by index and by item
		studentsCollection.remove(0); // ( not part of set collection )
		studentsCollection.remove("shyam");
		
		// iterate items. Read items from the collection list
		Iterator<String> readStudentsCollection=studentsCollection.iterator();
		while(readStudentsCollection.hasNext())
		{
			String studentName=readStudentsCollection.next();
			System.out.println("List student name:"+studentName);
		}
		
		// read purpose
		for(int i=0;i<studentsCollection.size();i++)
		{
			String names=studentsCollection.get(i);
			System.out.println("List student name:"+names);
		}

		for(String s:studentsCollection) {
			System.out.println(s);
		}
	}
}
