package exceptin;

public class Bank {
	public int balance=100;
	public void withdraw(int amount) throws InsufficientFundException {
		
		if(amount > balance)
		{
			InsufficientFundException exc=new InsufficientFundException(
					"please withdraw within your limit.. balnce is:"+balance
					);
			throw exc;
		}
		else
			balance=balance-amount;
	}
}
