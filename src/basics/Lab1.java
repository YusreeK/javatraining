package basics;

public class Lab1 {

	public static void main(String[] args) {
		// Write a function that takes a value N and returns the sum of 1 to n
		System.out.println(sum(4));
		//write a function that computes the factorial *hint: use recursion, n = n*(n-1)! = n*(n-1)*(n-2)! = n*(n-1)*(n-2)*(n-3)...
		System.out.println("factorial: " + fact(5));
	}
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print(sum + " + " + i);
			sum = sum + i;
			System.out.println(" = " + sum);
		}
		return sum;
	}	
	
	public static int fact (int n) {
		if (n == 0) {
			return 1;
		}
		System.out.println(n);
		return fact(n-1) * n;
	}
}
