package Str;

import java.util.Scanner;

public class TestStr {

	public static void main(String[] args) {
		String cust1="iphoneoneplus";
		
		System.out.println( cust1.indexOf("on"));
		System.out.println( cust1.lastIndexOf("on"));
		
		
		String cust2="iphone";
		String cust3=new String("iphone");
		System.out.println(cust1);
		System.out.println(cust2);
		System.out.println(cust3);
		if(cust1.equals(cust2))
			System.out.println("cust1 and cust2 are same");
		else
			System.out.println("cust1 and cust2 are different");
		
		if(cust1.equals(cust3))
			System.out.println("cust1 and cust3 are same");
		else
			System.out.println("cust1 and cust3 are different");
		
		
		String x="john";
		String y="JOHN";
		if(x.equalsIgnoreCase(y))
			System.out.println("x and y are same");
		else
			System.out.println("x and y are different");
		
		String firstName="john";
		String lastName=" doe";
		String address=" ny";
		String country=" usa";
		System.out.println(   
				firstName.concat(lastName).concat(address).concat(country)  
				
				);
		
		String phone="123 456-7890";
		System.out.println(phone);
		phone= phone.replaceAll(" ", "");
		phone= phone.replaceAll("-", "");
		System.out.println(phone);
		
		String details="john-doe-ny-usa";
		String[] detailArray=details.split("-");
		System.out.println( detailArray[2] );
		
		String p="john doe ny";
		System.out.println( p.substring(5));
		System.out.println( p.substring(2,6));
		
		String userid="JOhn12345";
		System.out.println( userid.toUpperCase() );
		System.out.println( userid.toLowerCase() );
		
		String uid="  john123    ";
		System.out.println(uid.trim());
		
		
		StringBuffer sb=new StringBuffer("hi john");
		sb.append("how are you");
		sb.append("hope you are ok");
		sb.append("lets meet tomo");
		System.out.println(sb);
		
		while(true) {
			System.out.println("enter email id");
			Scanner sc=new Scanner(System.in);
			String email=sc.next();

			if( email.contains("@") && 
					email.endsWith(".com") &&
						email.indexOf("@") != 0
					)
				;
			else
				System.out.println("invalid email.. please recheck email");
				
		}
		
		
		
	}

}
