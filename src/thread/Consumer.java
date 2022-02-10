package thread;

import java.util.Random;


public class Consumer implements Runnable{
	Stock stock;

	public Consumer(Stock shareProd) {
		stock=shareProd;
	}

	public void run() {
			try{
			while(true)
			{
					int buyQuantity = new Random().nextInt(10 - 1 + 1) + 1;
					synchronized (stock) {
						if(stock.quantity < buyQuantity) {
							System.out.println("Notify Producer OUT OF STOCK : Total stocks :"+stock.quantity+" orders placed :"+ buyQuantity);
							stock.notify();// notify producer thread to start producing
							stock.wait();// wait until producer thread notifies new stock
						}
						System.out.println("Consumer bought :"+ buyQuantity);
					stock.quantity=stock.quantity-buyQuantity;
					}
			}
			
		}catch(Exception e)
		{
			
		}
		
	}

	public String searchAndReplace(String address)
	{
		String newAddress=null;
		boolean searc=address.contains("irving");
		if(searc){
			newAddress=address.replaceAll("irving", "dallas");
		}
		return newAddress;
		
	}
	
}
