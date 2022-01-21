
public class School {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
	//  datatype variable_name=value	
		Student s3=new Student();
		s1.name="john";
		s1=s2;
		s2.name="jane";
		s1=s3;
		s3.name="mike";
		// RHS is s3 which is student
		// LHS is name from student class which is String
		//s2.name=s3;
		//s2.name=s3.name;
		System.out.println(s1.name);
		System.out.println(s2.name);
		System.out.println(s3.name);
	}

}
