package oop;

public class BankAccount {
		// Define variables
		String accountNumber;
		
		// static >> belongs to the CLASS not the object instance
		// final >> constant (often static final)
		static final String routingNumber = "000001";
		String name;
		String IDN;
		String accountType;
		
		// Constructor definitions: unique methods
			// 1. They are used to define / setup / initialize properties of an object
			// 2. Constructors are IMPLICITLY called upon instantiation
			// 3. The same namer as the class itself
			// 4. Constructors have NO return type
		BankAccount() {
			System.out.println("NEW ACCOUNT CREATED");
		}
		// Overloading call same method name with different arguments
		BankAccount(String accountType) {
			System.out.println("NEW ACCOUNT: " + accountType);
		}
		BankAccount(String accountType, double initDeposit) {
			System.out.println("NEW ACCOUNT: " + accountType);
			System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);
			if (initDeposit < 1000) {
				String errorMsg = "ERROR: Minimum deposit must be at least $1,000";
				System.out.println(errorMsg);
			}
		}
		
		
		// Define methods
		void deposit() {
				
		}
		
		void withdraw() {
			
		}
		
		void checkBalance() {
			
		}
	
		void getStatus() {
			
		}
	
	
}