package basics;

public class NumbersCalc {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		// System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		
	}
	
	static void printName() {
		System.out.println("Hello Yusree Karlie");
		
	}
	
	static void addNumbers(int numberA, int numberB ) {
		// This function will add two numbers 
		int sum = numberA + numberB;
		System.out.println("The sum of number " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product + 50, product);
		return product;
	}				
}
