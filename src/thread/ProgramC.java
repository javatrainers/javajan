package thread;
public class ProgramC extends Thread {
	public void run() {
		System.out.println("ProgramC start");
		long i=0;
		while(i < 10000000000l) {
			i++;
		}
		System.out.println("ProgramC ends");
	}
}
