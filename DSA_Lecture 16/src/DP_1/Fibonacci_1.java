package DP_1;

public class Fibonacci_1 {

	//fib Recursion
	public static int fib(int n) { // time complexity 0(n^2)
		if(n==0 || n==1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

	//fib Memoization
	public static int fibM(int n) { //time complexity 0(n)
		int storage[] = new int[n+1]; // creating an storage Array in which we will store all the distinct values so that we don't
		// have to calculate the same values many times
		for(int i = 0 ; i <= n ; i++) {// Initially we will store -1 in the array
			storage[i] = -1;
		}
		return fibM(n , storage);
	}

	public static int fibM(int n, int[] storage) {
		if(n == 0 || n== 1) {
			storage[n] = n;
			return storage[n];
		}
		if(storage[n] != -1) { // if the value is already calculated we will return
			return storage[n];
		}
		storage[n] = fibM(n -1 , storage) + fibM(n-2 , storage);

		return storage[n];
	}

	//fib Dynamic Programming
	public static int fibDP(int n) {
		int storage[] = new int[n+1];
		storage[0] = 0;
		storage[1] = 1;

		for(int i = 2 ; i <= n ; i++) {
			storage[i] = storage[i-1] + storage[i-2];

		}
		return storage[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 45;
		System.out.println(fibDP(n));
		System.out.println(fibM(n)); // this will take less time 
		System.out.println(fib(n)); // this will take more time


	}

}
