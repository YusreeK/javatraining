package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("8407035162089", 1000.50);
		BankAccount acc2 = new BankAccount("8407035162087", 2000);
		BankAccount acc3 = new BankAccount("8407035162085", 2500);
		BankAccount acc4 = new BankAccount("8407035162081", 3000);
		
		acc1.setName("Yusree");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}

}


class BankAccount implements Interest {
	// Properties of bank account
	private static int iD;          // Internal ID
	private String accountNumber;   // iD + random 2-digit number + first 2 IDN
	private static final String routingNumber = "0012345";
	private String name;
	private String IDN;
	private double balance;
	
	// Constructor
	public BankAccount(String IDN, double initDeposit) {
		balance = initDeposit;
		this.IDN = IDN;
		iD++;
		setAccountNumber();
		
	}
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		 accountNumber = iD + "" + random + IDN.substring(0, 2);
		 System.out.println("Your Account Number:" + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance-amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		balance = balance+amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[balance " + balance + "]";
		
		
	}
}