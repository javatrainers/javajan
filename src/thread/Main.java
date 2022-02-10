package thread;
public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main starts");
		ProgramA pa=new ProgramA();
		ProgramB pb=new ProgramB();
		ProgramC pc=new ProgramC();
		pa.start();
		Thread t=new Thread( pb  );
		t.start();
		pc.start();
		
		pc.setPriority(Thread.MAX_PRIORITY);
		pa.setPriority(Thread.MIN_PRIORITY);
		
		// 1000 milli seconds = 1 second
		pa.join(4000); // timed waiting
		pa.stop();
		//pa.join( );// indefinite waiting
		// main program will wait until
		// programA ends
		System.out.println("main ends");
		/*
		// start thread, if program implements runnable
		Thread t=new Thread(pa);
		t.start();
		// start thread, if program extends Thread
		pb.start();
		pc.start();
		// 1 to 10
		pb.setPriority(10);
		pc.setPriority(1);
	//	t.join(10000);
	//	System.out.println("main ends");
	//	t.stop();
	 * */
	 
	}

}
