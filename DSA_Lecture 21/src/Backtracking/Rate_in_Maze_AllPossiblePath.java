//You are given a N*N maze with a rat placed at maze[0][0]. Find and print all paths that rat can follow to
//reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
//Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not
//enter into those cells and those with value 1 are open.
//	Sample Input 1 :
//	3
//	1 0 1
//	1 0 1
//	1 1 1
//	Sample Output 1 :
//	1 0 0 1 0 0 1 1 1 
//	Sample Output 1 Explanation :
//	Only 1 path is possible
//	
//	1 0 0
//	1 0 0
//	1 1 1

package Backtracking;

import java.util.Scanner;

public class Rate_in_Maze_AllPossiblePath {
	private static void PrintAllPath(int[][] maze , int[][] path, int i, int j) {
		// int n = maze.length;
		if(i < 0 || i >= maze.length || j < 0 || j >= maze.length){ // when the index is going out of the array index
			return;
		}
		if(maze[i][j] == 0){ // when the particular maze value is 0 that means "block shell" we will not travel                             // through that path and return false
			return;
		}
		if(path[i][j] == 1){ // when the path is already traveled we will return false
			return;
		}

		path[i][j] = 1; // updating the path which we have travel

		if(i == path.length -1 && j == path.length -1){// when we have reach the destination we will return true
			for(int k = 0 ; k < maze.length ; k++) {
				for(int p = 0 ; p < maze.length ; p++) {
					System.out.print(path[k][p] +" ");
				}
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}

		PrintAllPath(maze , path , i-1 , j);

		PrintAllPath(maze , path , i , j+1);

		PrintAllPath(maze , path , i+1 , j);

		PrintAllPath(maze , path , i , j-1);

		path[i][j] = 0;

	}

	static void ratInAMaze(int maze[][], int n) {
		 
		int path[][] = new int[n][n];
		PrintAllPath(maze, path , 0 ,0);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the maze");
		int n = s.nextInt();
		int maze[][] = new int[n][n];
		System.out.println("Enter the maze");
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				maze[i][j] = s.nextInt();
			}
		}
		//calling the function
		ratInAMaze(maze , maze.length);
		 

	}

}


