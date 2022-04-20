package Array2D;
import java.util.Scanner;
public class How_are_2D_Array_store {
	
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
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j ++){
				System.out.println("Enter element at "+i+" row "+j+" column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		int input[][] = takeInput();
		print(input);

	}

}
