package Recursion_1;

public class FibonacciNumber {
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		int output1 =fib(n-1);
		int output2 =fib(n-2);
		return output1 + output2;
	}

	public static void main(String[] args) {

       int n=5;
       System.out.println(fib(n));

	}

}
