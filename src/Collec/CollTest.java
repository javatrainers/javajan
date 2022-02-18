package Collec;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class CollTest {

	public static void main(String[] args) {
		Student s1=new Student(1,"john doe");
		Student s2=new Student(1,"jane doe");
		Student s3=new Student(2,"mike doe");
		Student s4=new Student(3,"andy doe");
		Student s5=new Student(1,"john doe");
		
		TreeSet<Student> school=new TreeSet<Student> ();
	 	school.add(s1);
	 	school.add(s2);
	 	school.add(s3);
	 	school.add(s4);
	 	school.add(s5);
	 	System.out.println("student set:"+school.size());
	 	for(Student s: school)
	 		System.out.println(s);
	 	
	 	
	 	HashMap<String, Integer> scores=new HashMap<String, Integer> ();
	 	scores.put("john", 65);
	 	scores.put("jane", 75);
	 	scores.put("mike", 60);
	 	scores.put("john", 60);
	 	System.out.println(scores);
	 	scores.remove("mike");
	 	System.out.println(scores);
	 	
	}

}
