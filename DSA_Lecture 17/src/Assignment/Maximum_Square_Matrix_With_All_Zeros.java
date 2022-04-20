//Given an NxM matrix that contains only 0s and 1s, find out the size of the maximum square sub-matrix 
//with all 0s. You need to return the size of the square matrix with all 0s.
//Sample Input 1:
//3 3
//1 1 0
//1 1 1
//1 1 1
//Sample Output 1:
//1

package Assignment;

public class Maximum_Square_Matrix_With_All_Zeros {

	public static int findMaxSquareWithAllZeros(int[][] input){

		int maxValue = Integer.MIN_VALUE;//will store the value of maximum square of zeroes
		
		int col = input[0].length;
		int row = input.length;
		
		if(row == 0){
			return 0;
		}
		
		int storage[][] = new int[row][col]; //in this will store the value of maximum square matrix
		 //putting the values in 1st row
		// the value is 1 in input array we will store 0 in the storage array and vice versa
		for(int i = 0; i < row; i++){
			if(input[i][0] == 0){
				storage[i][0] = 1;
			}else {
				storage[i][0] = 0;
			}
		}
		// same work for the 1st column
		for(int i = 0; i < col; i++){
			if(input[0][i] == 0){
				storage[0][i] = 1;
			}else {
				storage[0][i] = 0;
			}
		}
		for(int i = 1; i < row; i++){
			for(int j = 1; j < col; j++){
				if(input[i][j] == 0){
					storage[i][j] = 1 + Math.min(storage[i-1][j-1],Math.min(storage[i][j-1], storage[i-1][j]));
							
					//storing the maximum value so that we have not to traverse in storage array to find the maximum value
					if(storage[i][j] > maxValue){
						maxValue = storage[i][j];
					}
				}
				else {
					storage[i][j] = 0;
				}
			}
		}

		return maxValue;
	}

	public static void main(String[] args) {
		int input[][] = {{1,1,0},{1,0,1},{1,1,1}};

		System.out.println(findMaxSquareWithAllZeros(input));

	}

}
