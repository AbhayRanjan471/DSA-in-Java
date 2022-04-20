//A thief is robbing a store and can carry a maximal weight of W into his knapsack. There are N items 
//and ith item weighs wi and is of value vi. Considering the constraints of maximum weight that
//knapsack can carry, you have to find and return the maximum value that thief can generate by stealing items.
	//Sample Input 1 :
	//4
	//1 2 4 5
	//5 4 8 6
	//5
	//Sample Output 1 :
	//13

package DP_2;

public class Knapsack {
	//Recursive approach
	public static int knapsack(int[] weights, int[] values, int maxWeight) {

		return knapsack(weights , values , maxWeight , 0);
	}


	public static int knapsack(int[] weights, int[] values, int maxWeight, int i) {
		//base Case
		if( i == weights.length || maxWeight == 0) {
			return 0;
		}

		// when the weight at 'i' is greater the maxWeight
		if(weights[i] > maxWeight) {
			return knapsack(weights, values, maxWeight , i+1);
		}
		//when the weight at 'i' is smaller then maxWeight
		else {
			//Here we have two option 
			//1. include this ith item
			int opt1 = values[i] + knapsack(weights, values, maxWeight - weights[i] , i + 1);
			//2. don't include
			int opt2 = knapsack(weights, values, maxWeight , i + 1);

			return Math.max(opt1, opt2);
		}

	}

	//Memoization
	public static int knapsackM(int[] weights, int[] values,int n , int maxWeight) {
		int storage[][] = new int[n+1][maxWeight + 1];
		for(int i = 0 ; i < n+1 ; i++) {
			for( int j =0 ; j < maxWeight ; j++) {
				storage[i][j] = -1;

			}
		}
		return knapsackM(weights , values ,n , maxWeight , 0 , storage);

	}

	public static int knapsackM(int[] weights, int[] values,int n , int maxWeight, int i , int[][] storage) {
		//base Case
		if( storage[i][maxWeight] != -1) {
			return storage[i][maxWeight];
		}
		if( i == weights.length || maxWeight == 0) {
			storage[i][maxWeight] = 0;
			return storage[i][maxWeight];
		}

		// when the weight at 'i' is greater the maxWeight
		if(weights[i] > maxWeight) {
			storage[i][maxWeight] = knapsackM(weights, values,n , maxWeight , i+1 , storage);
		}
		//when the weight at 'i' is smaller then maxWeight
		else {
			//Here we have two option 
			//1. include this ith item
			int opt1 = values[i] + knapsackM(weights, values,n , maxWeight - weights[i] , i + 1 , storage);
			//2. don't include
			int opt2 = knapsackM(weights, values,n , maxWeight , i + 1 ,storage);

			storage[i][maxWeight] = Math.max(opt1, opt2);
		}
		return storage[i][maxWeight];

	}

	//Dynamic Programming
	public static int knapsackDP(int[] weights, int[] values,int n , int maxWeight) {
		//making storage array in which we will store the max weight in each index
		int storage[][] = new int[n + 1][maxWeight + 1];
//		 the first row and column will be 0
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= maxWeight ; j++) {
				
				if(weights[i -1] <= j) {// when weight at 'i' is smaller then the maxWeight possible at 'j'th index
					// Here we have two option
					//1. don't include this ith item 
					int opt1 = storage[i - 1][j]; 
					
					//2. include this ith item 
					int remWeight = j - weights[i - 1]; 
					int opt2 = values[i -1] + storage[i -1][remWeight];
					
					storage[i][j] = Math.max(opt1, opt2);
				}
				else {
					storage[i][j] = storage[i -1][j];
				}
			}
		}
		return storage[n][maxWeight];
	}

	public static void main(String[] args) {
		int weights[] = {6,1,2,4,5};
		int values[] = {10, 5,4,8,6};
		int maxWeights = 5;
		System.out.println(knapsackDP(weights, values, 5 , maxWeights));
		System.out.println(knapsackM(weights, values, 5 , maxWeights));
		System.out.println(knapsack(weights, values, maxWeights));


	}

}
