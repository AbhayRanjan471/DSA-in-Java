package Recursion_1;

public class Factorial {

	public static int fact(int n) {
		if(n==0) { // its a base case
			return 1;
		}
		int smallAns=fact(n-1);// treat it as different function although it's same
		return n*smallAns;
	}
	public static void main(String[] args) {
		
		int n=3;
		int ans=fact(n);
		System.out.println(ans);
	}
}
