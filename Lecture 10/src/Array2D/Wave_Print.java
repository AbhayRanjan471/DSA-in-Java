package Array2D;
import java.util.Scanner;
//For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order,
//i.e, print the first column top to bottom, next column bottom to top and so on.

public class Wave_Print {
	public static void wavePrint(int mat[][]){
		//Your code goes here
        int rows=mat.length;
        if(rows==0){
            return;
        }
        int cols=mat[0].length;
        for(int i=0;i<cols;i++){
            if(i%2==0){
                for(int j=0;j<rows;j++){             //LOGIC:-if column is even then printing column form upward to downward direction
                    System.out.print(mat[j][i]+" ");

                }
            }
            else{ 
                for(int k=rows-1;k>=0;k--){           //printing column from downward to upward direction
                    System.out.print(mat[k][i]+" ");  

                }
            }
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
		 wavePrint(arr);
	}
}
