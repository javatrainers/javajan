import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int balance=100;
		int registeredPin = 1234;
		// sc is created with System.in = use take input from the screen
		// scanner is a in-built program available from Java installation
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a 4 digit pin");
		int customerEnteredPin = sc.nextInt();// nextInt is a method in scanner.
												// that captures customers input
												// and gives to the LHS variable
		if (registeredPin == customerEnteredPin) {
			System.out.println("welcome to java bank");
			System.out.println("press 1 for withdraw, 2 for deposit, 3 for exit");
			int choice = sc.nextInt();
			switch (choice) {
				case 1: {
					System.out.println("Enter Amount to withdraw");
					int withdrawAmount=sc.nextInt();
					if(balance > withdrawAmount) {
						balance=balance-withdrawAmount;
						System.out.println("your new balance is:"+balance);
					}else{
						System.out.println("insufficient fund, your balance is:"+balance);
					}
					break;
				}
				case 2:{
					System.out.println("Enter Amount to deposit");
					int depositAmount=sc.nextInt();
					balance=balance + depositAmount;
					System.out.println("your new balance is :"+balance);
					System.out.println("thank you for using Java bank");
					break;
				}
				case 3:{
					System.out.println("thank you for using Java bank");
					break;
				}
			}

		} else {
			System.out.println("invalid pin");
		}

	}

}
