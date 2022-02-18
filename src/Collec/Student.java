package Collec;

public class Student implements Comparable<Student> {
	public int grade;
	public String name;
	public Student(int g, String n) {
		grade = g;
		name = n;
	}
	
	// categorizing
	public int hashCode() {
		return grade;
	}
	
	// Iphone3 i=new IphoneX();
	// i.facialRecog();
	
	// search for duplicates
	public boolean equals(Object o) {
		Student anotherStudObject=(Student)o;
		if(this.name.equals(anotherStudObject.name)
				&&
				this.grade==anotherStudObject.grade
				)
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "Student [grade=" + grade + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student otherObject) {
		return this.name.compareTo(otherObject.name) ;
	}
}
