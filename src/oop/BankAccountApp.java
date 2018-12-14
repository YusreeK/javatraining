package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "00000000001";
		
		
		BankAccount acc2 = new BankAccount("Savings Account");
		acc2.accountNumber = "00000000001";
		
		
		BankAccount acc3 = new BankAccount("Cheque", 5000);
		acc3.accountNumber = "00000000001";
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
	}

}

