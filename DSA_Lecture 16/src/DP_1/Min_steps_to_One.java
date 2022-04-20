package DP_1;

public class Min_steps_to_One {

	//Brute force approach
	public static   int countStep(int n) {

		if(n == 1) {
			return 0;
		}
		int op1 = countStep(n-1);
		int minSteps = op1;

		if(n % 3 == 0) {
			int op2 = countStep(n/3);
			if(op2 < minSteps) {
				minSteps = op2;
			}
		}
		if(n % 2 == 0) {
			int op3 = countStep(n/2);
			if(op3 < minSteps) {
				minSteps = op3;
			}
		}
		return 1 + minSteps;
	}
	
	//memoziation
	public static int countStepM(int n) {
		int storage[] = new int [n+1];
		return countStepM(n , storage);
	}
	
	public  static int countStepM(int n, int[] storage) {
		 if(n == 1) {
			 storage[n] = 0;
			 return storage[n];
		 }
		 if(storage[n] != 0) {
			 return storage[n];
		 }
		 
		 int op1 = countStepM(n-1 , storage);
			int minSteps = op1;

			if(n % 3 == 0) {
				int op2 = countStepM(n/3 , storage);
				if(op2 < minSteps) {
					minSteps = op2;
				}
			}
			if(n % 2 == 0) {
				int op3 = countStepM(n/2 , storage);
				if(op3 < minSteps) {
					minSteps = op3;
				}
			}
			storage[n] = 1 + minSteps;
			return storage[n];

	}
	
	//Dynamic programming (bottom to top approach) or tabulated form
	public static int countStepDP(int n) {
		int storage[] = new int[n+1]; // here we will store the no, of step taken by each index to reach n =1
		storage[1] = 0; // base case we know that it will take 0 steps to for n =1;
		
		for(int i = 2 ; i <= n ; i++) {
			int min = storage[i -1]; //first case
			
			if( i % 3 == 0) { // second case
				if(min > storage[i/3]) {
					min = storage[i/3]; // update the minimum
				}
			}
			if(i % 2 == 0) { // third case
				if(min > storage[i/2]) {
					min = storage[i/2];
				}
			}
			storage[i] = min + 1;
		}
		return storage[n];
	}

	public static void main(String[] args) {

		int n = 100;
		System.out.println(countStepDP(n));
		System.out.println(countStepM(n));
		System.out.println(countStep(n));
		

	}

}
