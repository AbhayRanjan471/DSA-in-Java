package Recursion_1;

//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
//Do this recursively.

public class Calculate_Power {

	public static int power(int x, int n) {
		
		  if(x >= 0 && n == 0){
	            return 1;
	        }
	        else if(x == 0 && n >=0){
	            return 0;
	        }
			if(n==1) {
				return x;
			}
			int pdtSeries=power(x,(n-1)) *x;
		
		return pdtSeries ;
	}
	public static void main(String[] args) {
		 int x=4;
		 int n=3;
		 System.out.println(power(x,n));

	}

}
