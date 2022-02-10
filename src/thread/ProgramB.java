package thread;
public class ProgramB extends Parent  implements Runnable {
	public void run() {
		System.out.println("ProgramB start");
		long i=0;
		while(i < 10000000000l) {
			i++;
		}
		System.out.println("ProgramB ends");
	}
}
