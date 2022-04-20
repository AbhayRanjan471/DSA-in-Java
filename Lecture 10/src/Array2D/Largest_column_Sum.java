package Array2D;

import java.util.Scanner;

public class Largest_column_Sum {
	public static int largestColSum(int input[][]) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<input[0].length;i++) {
			int sum=0;
			for(int j=0;j<input.length;j++) {
				sum=sum+input[j][i];
			}
			if(sum>largest) {
				largest=sum;
			}
		}
		return largest;
	}
	public static void print(int[][] input){
		int rows = input.length;  // this is the way to take the length of rows
		int cols = input[0].length;  // this is the way to take the length of column2
	
		
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows = s.nextInt();
		System.out.println("Number of columns ");
		int cols = s.nextInt();
		int input[][] = new int[rows][cols];
		System.out.println("eneter the elements in array");
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j ++){
				//System.out.println("Enter element at "+i+" row "+j+" column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		
		int input[][] = takeInput();
		print(input);
		System.out.println("largest col sum "+ largestColSum(input));

	}
}
