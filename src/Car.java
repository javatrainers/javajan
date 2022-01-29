
public class Car {
	public String color="red";
	public int door=4;
	public String musicSystem="dolby";
	
	public Car(String c) {
		color=c;
	}
	public Car(String c,int d) {
		color=c;
		door=d;
	}
	public Car(String c,int d,String m) {
		color=c;
		door=d;
		musicSystem=m;
	}
	
/*
 // compiler add default constructor
	// IF no constructor mentioned
		public Car() {
			
		}
 */
}
