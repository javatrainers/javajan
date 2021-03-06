package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Student s=new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		
		Scanner sc=new Scanner(System.in);
			System.out.println("enter name");
			String n=sc.next();
			System.out.println("enter age");
			int a=sc.nextInt();
			s.name=n;
			s.age=a;
			
			System.out.println(s.name);
			System.out.println(s.age);
				
			File f=new File("D:/Tutorial/studentObject.txt");
			FileOutputStream fos=new FileOutputStream(f);
			ObjectOutputStream os=new ObjectOutputStream(fos);
			os.writeObject(s);
			os.close();
			
	}

	
	public static void asd(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream os=new ObjectInputStream( new FileInputStream("D:/Tutorial/Object.txt"));
		Student s=(Student) os.readObject();
		System.out.println(s.name);
		System.out.println(s.age);
	}
	
}
