// Gary has a board of size NxM. Each cell in the board is a coloured dot. There exist only 26 colours denoted by uppercase Latin characters (i.e. A,B,...,Z). 
// Now Gary is getting bored and wants to play a game. The key of this game is to find a cycle that contain dots of same colour.
// Sample Input 1:
//3 4
//AAAA
//ABCA
//AAAA
//Sample Output 1:
//true

package Assignment;

import java.util.Scanner;

public class Connecting_Dots {

	//int dest_i,int dest_j keeps the index of the starting point of the cycle
	public static boolean findDot(String[] board , char dot , int i , int j , boolean[][] visited,int dest_i,int dest_j,int count){
		if(i >= board.length || i < 0 || j >= board[0].length() || j < 0){
			return false;
		}

		if(dest_i==i && dest_j==j)
		{
			if(count>=4) return true; // in the given Q it is given that cycle should be >= 4
			else return false;
		}

		if(visited[i][j]){
			return false;
		}
		// if(dot == board[i].charAt(j)){
		if(dot != board[i].charAt(j)){
			return false;
		}
		visited[i][j] = true;
		count++;
		if(findDot(board , dot , i , j + 1 , visited,dest_i,dest_j,count)){
			return true;
		}
		if(findDot(board , dot , i , j -1, visited,dest_i,dest_j, count)){
			return true;
		}
		if(findDot(board , dot , i+1 , j, visited,dest_i,dest_j,count)){
			return true;
		}
		if(findDot(board , dot , i-1 , j  , visited,dest_i,dest_j,count)){
			return true;
		}
		else{
			visited[i][j] = false;
			return false;
		}

	}

	public static  int solve(String[] board , int n, int m)
	{

		boolean visited[][] = new boolean[n][m];

		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < m ; j++){
				char dot = board[i].charAt(j);
				visited[i][j] = true;

				//traversing in all the 4 direction         
				if(findDot(board , dot , i , j + 1 , visited, i, j, 1)){
					return 1;
				}
				if(findDot(board , dot , i , j -1, visited, i, j, 1)){
					return 1;
				}
				if(findDot(board , dot , i+1 , j, visited,i, j, 1)){
					return 1;
				}
				if(findDot(board , dot , i-1 , j  , visited,i, j, 1)){
					return 1;
				}
				// else{
				//     return 1;
				// }
			}
		}
		return 0;


	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the board size N*M");
		int n = s.nextInt();
		int m = s.nextInt();
		String board[] = new String[n];
		System.out.println("Enter the board");
		for(int i = 0 ; i < n ; i++) {	  
			board[i] = s.next();
		}
		//calling the function
		int cycle = solve(board, n, m);

		if(cycle == 1) {
			System.out.println("There exist a cycle : true");
		}
		else {
			System.out.println("There doesn't exist a cycle : false");
		}
	}

}
