//You are given N, and for a given N x N chessboard, find a way to place N queens such that no queen can attack
//any other queen on the chess board. A queen can be killed when it lies in the same row, or same column,
//or the same diagonal of any of the other queens. You have to print all such configurations.
//Input Format :
	//Sample Input 1:
	//4
	//Sample Output 1 :
	//0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 0 
	//0 0 1 0 1 0 0 0 0 0 0 1 0 1 0 0 

package Backtracking;

import java.util.Scanner;

public class N_Queens {

	//it check for the condition that A queen can be killed when it lies in the same row, or same column,
	//or the same diagonal of any of the other queens.
	//there are mainly 3 direction to check bcz we are inserting elements from top to bottom
	private static boolean isBoardSafe(int[][] board, int row, int col) {
		 
		int n =board.length;
		//diagonal from bottom to up in right to left passing through center
		for(int i =row-1, j=col-1; i>=0 && j>=0; i--, j--){
			if(board[i][j]==1){
				return false;
			}
		}
		//diagonal from top to bottom in left to right passing throught center
		// for(int i =row+1, j=col+1; i<n && j<n; i++, j++){
		//     if(board[i][j]==1){
		//         return false;
		//     }
		// }
		//diagonal down right to left
		// for(int i =row+1, j=col-1; i<n && j>=0; i++, j--){
		//     if(board[i][j]==1){
		//         return false;
		//     }
		// }
		//diagonal up left to right
		for(int i =row-1, j=col+1; i>=0 && j<n; i--, j++){
			if(board[i][j]==1){
				return false;
			}
		}
		//up in same block
		for(int i =row-1; i>=0; i--){
			if(board[i][col]==1){
				return false;
			}
		}
		//down in same block
		// for(int i =row+1; i<n; i++){
		//     if(board[i][col]==1){
		//         return false;
		//     }
		// }
		return true;
	}

	private static void placeQueens(int board[][], int row, int n) {
		//print
		//when row equals to n that means we have placed yhe queen till the last row and now we will print the chessboard
		if(row==n){//Valid board configuration
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					System.out.print(board[i][j]+" ");
				}
			}
			System.out.println();
		}
		//calling the function
		for(int j=0;j<n;j++){
			//safe
			if(isBoardSafe(board, row, j)){ // first it will check for the index (row , j) that is it safe to place 
				board[row][j]=1;//if it is safe we will insert 1
				
				//reset
				placeQueens(board, row+1, n);// next we will recursively call for the next row
				board[row][j]=0;

			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the board");
		int n = s.nextInt();
		int board[][] = new int[n][n];
		placeQueens(board , 0 , n);

	}

}
