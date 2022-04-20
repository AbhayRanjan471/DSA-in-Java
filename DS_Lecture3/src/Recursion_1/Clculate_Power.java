package Recursion_1;

public class Clculate_Power {
	
	public static int pdt(int x, int n) {
		if(x >= 0 && n == 0) { // for :- 0^0 =1; 4^0=1
			return 1;
		}
		if(x == 0) {  // for:-0^7 =0
			return 0;
		}
		
		if(n==1) {
			return x;
		}
		int pdtSeries=pdt(x,(n-1)) *x;
	
	return pdtSeries ;
}
	public static void main(String[] args) {
		 
		 int x=0;
		 int n=8;
		 System.out.println(pdt(x,n));

	}

}
