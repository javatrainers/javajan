
public class ShowRoom {

	public static void main(String[] args) {
		Car customer1=new Car("black");
		Car customer2=new Car("green",2);
		Car customer3=new Car("white",2,"DTS");
		System.out.println(customer1.door)	;	
		System.out.println(customer2.color)	;	
		System.out.println(customer3.musicSystem);		

	}

}
