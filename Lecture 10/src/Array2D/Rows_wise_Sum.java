package Array2D;
import java.util.Scanner;
//For a given two-dimensional integer array/list of size (N x M), 
//find and print the sum of each of the row elements in a single line, separated by a single space.

public class Rows_wise_Sum {
	public static void print(int arr[][]) {
	int rows=arr.length;
	int cols=arr[0].length;
	
	for(int i = 0; i < rows; i++){
		int sum=0;
	
		for(int j = 0; j < cols; j++){
			sum +=arr[i][j]; 
		}
		System.out.print(sum+" ");
	}
	}
	
	public static int[][] takingInput(Scanner s){
		System.out.println("Enter number of rows ");
		int rows = s.nextInt();
		System.out.println("Number of columns ");
		int cols = s.nextInt();
		int input[][] = new int[rows][cols];
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j ++){
				System.out.println("Enter element at "+i+" row "+j+" column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int arr[][]=takingInput(s);
         print(arr);
	}

}
