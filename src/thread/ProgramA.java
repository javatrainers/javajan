package thread;
public class ProgramA extends Thread{
	public void run() {
		System.out.println("ProgramA start");
		long i=0;
		while(i < 10000000000l) {
			i++;
		}
		System.out.println("ProgramA ends");
	}
}
