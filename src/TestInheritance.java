
public class TestInheritance {

	public static void main(String[] args) {
		Iphone3 i=new Iphone5();
		// refer variable = access the content = Iphone3
		// real object has the content = Iphone 5
		
		i.camera();
		if(i instanceof Iphone5)
			((Iphone5)i).maps();// unblock/hidden feature
		
		Iphone5 i5=new Iphone5();
		i5.maps();
		i5.camera();
	}

}
