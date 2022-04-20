package Array2D;

import java.util.Scanner;

//For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
//a. First row(left to right)
//b. Last column(top to bottom)
//c. Last row(right to left)
//d. First column(bottom to top)
// Mind that every element will be printed only once.

public class Spiral_Matrix {
	
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int n=matrix.length;
        int m=matrix[0].length;
        int rowstart=0;
        int colstart=0;
        int colend=m-1;
        int rowend=n-1;
        
        while(rowstart<= rowend && colstart <= colend) {
        	
        	for(int col=colstart ;col<=colend;col++) {
        		System.out.print(matrix[rowstart][col] +" ");	
        	}
        	rowstart++;
        	
        	for(int row=rowstart ;row<=rowend ;row++) {
        		System.out.print(matrix[row][colend] +" ");
        	}
        	colend--;
        	
        	for(int col=colend; col>=colstart ;col--) {
        		System.out.print(matrix[rowend][col] +" ");
        	}
        	rowend--;
        	
        	for(int row=rowend ;row>=rowstart ;row--) {
        		System.out.print(matrix[row][colstart] +" ");
        	}
        	colstart++;
        }
	}
	public static int[][] takingInput(Scanner s){
		System.out.println("enter the row");
		int rows=s.nextInt();
		
		System.out.println("enter the no of column");
		int cols=s.nextInt();
		
		int arr[][]=new int[rows][cols];
		System.out.println("enter the elements in array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=takingInput(s);
		spiralPrint(arr);

	}

}
