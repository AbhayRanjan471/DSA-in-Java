//You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow
//to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
//Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not
//enter into those cells and those with value 1 are open.
	//Sample Input 1 :
	//3
	//1 0 1
	//1 0 1
	//1 1 1
	//Sample Output 1 :
	//true
	//Sample Input 2 :
	//3
	//1 0 1
	//1 0 1
	//0 1 1
	//Sample Output 2 :
	// false

package Backtracking;

import java.util.Scanner;

public class Rat_in_a_Maze {

	private static boolean solveMaze(int[][] maze , int[][] path, int i, int j) {
		   if(i < 0 || i >= maze.length || j < 0 || j >= maze.length){ // when the index is going out of the array index
	            return false;
	        }
	        if(path[i][j] == 1){ // when the path is already traveled we will return false
	            return false;
	        }
	        if(maze[i][j] == 0){ // when the particular maze value is 0 that means "block shell" we will not travel
	                             // through that path and return false
	            return false;
	        }
	        path[i][j] = 1; // updating the path which we have travel
	        
	        if(i == maze.length -1 && j == maze.length -1){// when we have reach the destination we will return true
	            return true;
	        }
	        //Exploring in all the four direction
	         if(solveMaze(maze , path , i-1 , j)){
	            return true;
	        }
	         if(solveMaze(maze , path , i , j+1)){
	             return true;
	         }
	         if(solveMaze(maze , path , i+1 , j)){
	             return true;
	         }
	         if (solveMaze(maze , path , i , j-1)){
	             return true;
	         }
	        return false;
	}
	public static boolean ratInMaze(int[][] maze) {
		int n = maze.length;
		 int path[][] = new int[n][n];
		 return solveMaze(maze, path , 0 ,0);
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
		 boolean pathPossible = ratInMaze(maze);
		 System.out.println(pathPossible);

	}

	

}
