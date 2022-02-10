package thread;

import java.util.Random;

public class Producer extends Thread {
	Stock stock;

	public Producer(Stock shareProd) {
		stock=shareProd;
	}

	public void run() {
			try{
			while(true){
					synchronized (stock) {
						stock.quantity=stock.quantity+10;
						System.out.println("Notify Consumers NEW STOCK ARRIVAL: Total stocks :"+stock.quantity);
						stock.notify(); // notify the consumers for new stock arrival
						stock.wait();// wait until the product runs out of stock and consumer notifies
					}
				}
				
			}catch(Exception e){
				
			}
		
	}

	
}
