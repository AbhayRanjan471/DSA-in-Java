//An integer matrix of size (M x N) has been given. Find out the minimum cost to reach from the cell (0, 0) to (M - 1, N - 1).
//From a cell (i, j), you can move in three directions:
//1. ((i + 1),  j) which is, "down"
//2. (i, (j + 1)) which is, "to the right"
//3. ((i+1), (j+1)) which is, "to the diagonal"
//The cost of a path is defined as the sum of each cell's values through which the route passes.
	//Sample Input 1 :
	//3 4
	//3 4 1 2
	//2 1 8 9
	//4 7 8 1
	//Sample Output 1 :
	//13

package DP_2;

public class Minimum_Cost_Path {
	
	//Recursive approach
	public static int minCostPath(int arr[][]){
		return minCostPath(arr, 0, 0);
	}

	// Min Cost Path from cell (i, j) to cell (m - 1, n - 1)
	private static int minCostPath(int[][] arr, int i, int j) {
		int row = arr.length;
		int col = arr[0].length;
		if(i == row - 1 && j == col - 1){ // this condition is true when we reach the destination
			return arr[i][j];
		}
		if(i >= row || j >= col){ //when index i and j will point the value outside the matrix
			return Integer.MAX_VALUE;
		}
		int op1 = minCostPath(arr, i , j + 1); // horizontal direction
		int op2 = minCostPath(arr, i + 1 , j + 1); // Diagonal direction
		int op3 = minCostPath(arr, i + 1, j ); // Downward direction

		return arr[i][j] + Math.min(op1,  Math.min(op2, op3)); // getting the minimum cost of all this 3 direction 
	}

	// Memoization
	public static int minCostPathM(int arr[][]){
		int row = arr.length;
		int col = arr[0].length;
		
		int storage[][] = new int[row][col]; // creating a 2D array and initially initializing it with value -1
		for(int i =0 ; i < row ; i++) {
			for(int j =0 ; j < col ; j++) {
				storage[i][j] = -1;
			}
		}
		return minCostPathM(arr , storage , 0 , 0);
	}
	public static int minCostPathM(int[][] arr,int storage[][] , int i, int j) {
		 int row = arr.length;
		 int col = arr[0].length;
		 
		 if(i == row - 1 && j == col - 1) { // when we have reached the last cell
			 //storage[row-1][col-1] = arr[i][j];
			// return storage[i][j];
			     //OR
			 return arr[i][j];
		 }
		 if(i >= row || j >= col) { // if the index is out of range we will return max value
			 return Integer.MAX_VALUE;
		 }
		 if(storage[i][j] != -1) {// if the value is already calculated we will return that value
			 return storage[i][j];
		 }
		 int opt1 = minCostPathM(arr , storage , i , j+1);
		 int opt2 = minCostPathM(arr, storage, i+1, j+1);
		 int opt3 = minCostPathM(arr, storage, i+1, j);
		 
		 storage[i][j] = arr[i][j] + Math.min(opt1, Math.min(opt2, opt3));
		 return storage[i][j];
		
	}

	// Dynamic Programming 
	public static int minCostPathDP(int arr[][]){
		int row = arr.length;
		int col = arr[0].length;
		int storage[][] = new int[row][col];
		
		storage[row-1][col-1] = arr[row-1][col-1];//Initially initializing the the last value of the Array arr to the storage Array
		
		//calculating min value of Last row
		for(int j = col -2 ; j >= 0 ; j--) {
			storage[row-1][j] = storage[row-1][j+1] + arr[row-1][j];
		}
		//calculating the min value of last column
		for(int i = row -2 ; i >= 0 ; i --) {
			storage[i][col -1] = storage[i+1][col -1] + arr[i][col -1];
		}
		
		//now for rest of the index 
		for(int i = row -2 ; i >= 0 ; i--) {
			for(int j = col -2 ; j >= 0 ; j--) {
				int opt1 = storage[i][j+1];
				int opt2 = storage[i+1][j+1];
				int op3 = storage[i+1][j];
				storage[i][j] = arr[i][j] + Math.min(opt1, Math.min(opt2, op3));
			}
		}
		return storage[0][0];
	}
	
	
	public static void main(String[] args) {
		 int arr[][] ={ {3,4,1,2} , {2,1,8,9} , {4,7,8,1}};
		System.out.println(minCostPath(arr));
		System.out.println(minCostPathM(arr));
		System.out.println(minCostPathDP(arr));

	}
}
	
//	   public static int minCostPathDP(int[][] input) {
//	        int row = input.length;
//	        int col = input[0].length;
//
//	        int dp[][] = new int[row][col];
//
//	        for(int i = dp.length-1 ; i >= 0; i--){
//	            for(int j = dp[0].length -1 ; j >= 0 ; j--){
//
//	                if(i == dp.length -1 && j == dp[0].length -1){
//	                    dp[i][j] = input[i][j];
//	                }
//	                else if(i == dp.length -1){
//	                    dp[i][j] = dp[i][j+1] + input[i][j];
//	                }
//	                else if(j == dp[0].length -1){
//	                    dp[i][j] = dp[i+1][j] + input[i][j];
//	                }
//	                else{
//	                    dp[i][j] = Math.min(dp[i+1][j] , dp[i][j+1]) + input[i][j];
//
//	                }
//	                return dp[i][j];
//	            }
//	            
//	            
//	        }
	       
//	   }

