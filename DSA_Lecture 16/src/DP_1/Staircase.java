//A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run-up to the stairs.
//Sample Input 1:
//4
//Sample Output 1:
//7

package DP_1;

public class Staircase {
	
	//recursion
	public static long staircase(int n) {
		if(n == 0) {
			return 1;
		}
		if(n ==1 || n == 2) {
			return n;
		}
		return staircase(n -1) + staircase(n -2) + staircase(n -3);
	}

	//memoziation 
	public static long staircaseM(int n) { // note: return type is long
		long storage[] = new long[n+1];
		return countPathM(n , storage);
	}
	public static long countPathM(int n , long storage[]){
		if(n == 0){
			// storage[n] = 1;
			return 1 ;
		}
		if(n ==1 || n == 2){
			// storage[n] = n ; 
			return n;
		}
		if(storage[n] != 0){
			return storage[n];
		}

		storage[n] = countPathM(n -1 , storage) + countPathM(n -2 , storage)+ countPathM(n -3 , storage);
		return storage[n];
	}

	//Dynamic Programing
	public static long staircaseDP(int n) {
		if(n == 1 || n==0){
			return 1;
		}
		long storage[] = new long[n + 1];
		storage[0] = 1;
		storage[1] = 1;
		storage[2] = 2;

		for(int i = 3 ; i <= n ; i++ ){
			storage[i] = storage[i -1] +storage[i - 2] + storage[i - 3];
		}
		return storage[n];
	}

	public static void main(String[] args) {
		 int n = 4;
		 System.out.println(staircaseDP(n));
		 System.out.println(staircaseM(n));
		 System.out.println(staircase(n));

	}

}
